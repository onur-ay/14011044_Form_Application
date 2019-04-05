package com.tools.aytech.mobilprogramming1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class ViewActivity extends AppCompatActivity {

    private static final String LOG_TAG = ViewActivity.class.getSimpleName();

    private TextView phoneField;
    private TextView emailField;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        phoneField = findViewById(R.id.phoneTextField);
        emailField = findViewById(R.id.emailTextField);
        imageView = findViewById(R.id.imageView);
        TextView birthDateField = findViewById(R.id.birthDatePicker);
        TextView nameField = findViewById(R.id.nameTextField);
        TextView surnameField = findViewById(R.id.surnameTextField);
        TextView birthPlaceField = findViewById(R.id.birthPlaceTextField);
        TextView citizenNoField = findViewById(R.id.citizenNoTextField);
        TextView ageField = findViewById(R.id.ageTextField);
        Button callButton = findViewById(R.id.callButton);
        Button sendButton = findViewById(R.id.emailButton);

        Intent incomingData = getIntent();

        if (incomingData.hasExtra("name"))
            nameField.setText(incomingData.getStringExtra("name"));
        if (incomingData.hasExtra("surname"))
            surnameField.setText(incomingData.getStringExtra("surname"));
        if (incomingData.hasExtra("birthPlace"))
            birthPlaceField.setText(incomingData.getStringExtra("birthPlace"));
        if (incomingData.hasExtra("phone"))
            phoneField.setText(incomingData.getStringExtra("phone"));
        if (incomingData.hasExtra("email"))
            emailField.setText(incomingData.getStringExtra("email"));
        if (incomingData.hasExtra("citizenNo"))
            citizenNoField.setText(incomingData.getStringExtra("citizenNo"));
        if (incomingData.hasExtra("birthDate"))
        {
            String birthDate = incomingData.getStringExtra("birthDate");
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy",java.util.Locale.getDefault());
            try {
                cal.setTime(sdf.parse(birthDate));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            LocalDate birth = LocalDate.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
            LocalDate now = LocalDate.now();
            Period age = Period.between(birth,now);
            ageField.setText(String.valueOf(age.getYears()));
            birthDateField.setText(incomingData.getStringExtra("birthDate"));

        }
        if (incomingData.hasExtra("image"))
            Picasso.get().load(Uri.parse(incomingData.getStringExtra("image"))).into(imageView);
        else
            Picasso.get().load(R.drawable.avatar_image).into(imageView);

        if(phoneField == null || phoneField.getText().toString().isEmpty())
            callButton.setVisibility(View.INVISIBLE);

        callButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d(LOG_TAG, "CALL BUTTON is clicked !");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ phoneField.getText().toString()));
                startActivity(callIntent);
            }
        });

        sendButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d(LOG_TAG, "SEND BUTTON is clicked !");
                String recipients = emailField.getText().toString();
                String[] recipientList = recipients.split(",");
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("message/rfc822");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, recipientList);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "14011044 - Onur Ay | Form Application E-Mail Test");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "This is a test mail.");
                try {
                    startActivity(Intent.createChooser(emailIntent,"Please choose an app:"));
                    finish();
                    Log.d(LOG_TAG, "E-MAIL is SENT !");
                }catch (android.content.ActivityNotFoundException ex){
                    Toast.makeText(getApplicationContext(), "There is no e-mail program installed !", Toast.LENGTH_SHORT).show();
                    Log.d(LOG_TAG, "There is NO E-MAIL PROGRAM installed !");
                }
            }
        });
    }
}
