package com.tools.aytech.mobilprogramming1;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import java.util.Calendar;
import java.util.Objects;

public class FormActivity extends AppCompatActivity {

    private static final String LOG_TAG = FormActivity.class.getSimpleName();
    private final static int GALLERY_PIC = 1;

    private TextView birthDateField;
    private TextView nameField;
    private TextView surnameField;
    private TextView birthPlaceField;
    private TextView phoneField;
    private TextView citizenNoField;
    private TextView emailTextField;
    private ImageView imageView;
    private Uri imageUri;

    private DatePickerDialog.OnDateSetListener myDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        birthDateField = findViewById(R.id.birthDatePicker);
        nameField = findViewById(R.id.nameTextField);
        surnameField = findViewById(R.id.surnameTextField);
        birthPlaceField = findViewById(R.id.birthPlaceTextField);
        phoneField = findViewById(R.id.phoneTextField);
        citizenNoField = findViewById(R.id.citizenNoTextField);
        emailTextField = findViewById(R.id.emailTextField);
        imageView = findViewById(R.id.imageView);

        Button clearButton = findViewById(R.id.clearButton);
        Button submitButton = findViewById(R.id.submitButton);
        Button listButton = findViewById(R.id.listButton);

        if(savedInstanceState != null){
            Log.d(LOG_TAG, "BUNDLE LOAD has started !");
            if(savedInstanceState.getString("name") != null)
                nameField.setText(savedInstanceState.getString("name"));
            if(savedInstanceState.getString("surname") != null)
                surnameField.setText(savedInstanceState.getString("surname"));
            if(savedInstanceState.getString("birthPlace") != null)
                birthPlaceField.setText(savedInstanceState.getString("birthPlace"));
            if(savedInstanceState.getString("birthDate") != null)
                birthDateField.setText(savedInstanceState.getString("birthDate"));
            if(savedInstanceState.getString("citizenNo") != null)
                citizenNoField.setText(savedInstanceState.getString("citizenNo"));
            if(savedInstanceState.getString("phone") != null)
                phoneField.setText(savedInstanceState.getString("phone"));
            if(savedInstanceState.getString("email") != null)
                emailTextField.setText(savedInstanceState.getString("email"));
            if(savedInstanceState.getString("image") != null){
                imageUri = Uri.parse(savedInstanceState.getString("image"));
                Picasso.get().load(imageUri).into(imageView);/**/
            }
            else{
                Picasso.get().load(R.drawable.avatar_image).into(imageView);
            }
            Log.d(LOG_TAG, "BUNDLE LOAD has finished !");
        }

        if(imageView.getDrawable() == null)
            Picasso.get().load(R.drawable.avatar_image).into(imageView);

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Log.d(LOG_TAG, "GO TO LIST Button clicked !");
                Intent listIntent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(listIntent);
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(LOG_TAG, "SUBMIT Button clicked!");

                String phoneNumber = phoneField.getText().toString();
                String email = emailTextField.getText().toString();

                if(!phoneNumber.isEmpty() && !email.isEmpty())
                {
                    Intent submitIntent = new Intent(getApplicationContext(), ViewActivity.class);
                    startSubmitActivity(submitIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "PHONE NUMBER and E-MAIL ADDRESS can't be empty!", Toast.LENGTH_SHORT).show();
            }
        });

        imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent uploadIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(uploadIntent, GALLERY_PIC);
                setResult(RESULT_OK);
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d(LOG_TAG, "CLEAR Button clicked!");
                birthDateField.setText(null);
                nameField.setText(null);
                surnameField.setText(null);
                birthDateField.setText(null);
                birthPlaceField.setText(null);
                citizenNoField.setText(null);
                phoneField.setText(null);
                Picasso.get().load(R.drawable.avatar_image).into(imageView);
                imageUri = null;
            }
        });

        birthDateField.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean b){
                if(b){
                    showDatePicker();
                }
            }
        });

        birthDateField.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showDatePicker();
            }
        });

        myDateSetListener = new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day){
                String date = (month+1) + "/" + (day) + "/" + (year);
                birthDateField.setText(date);
            }
        };

        citizenNoField.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean b)
            {
                if(!citizenNoField.getText().toString().isEmpty())
                {
                    if(citizenNoField.getText().length()!=11)
                    {
                        Toast.makeText(getApplicationContext(), "Invalid CITIZENSHIP NUMBER !", Toast.LENGTH_SHORT).show();
                        Log.d(LOG_TAG, "Invalid CITIZENSHIP NUMBER !");
                        citizenNoField.setText("");
                    }
                }
            }
        });

        emailTextField.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean b)
            {
                String email = emailTextField.getText().toString();
                if(!email.isEmpty())
                {
                    String emailValidationCode = "^(?:(?:\\+?([0-9]{1,2}?)\\s*(?:[.-]\\s*)?)?(?:\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+))?$";
                    if(!email.matches(emailValidationCode))
                    {
                        Toast.makeText(getApplicationContext(), "Invalid E-MAIL ADDRESS!", Toast.LENGTH_SHORT).show();
                        Log.d(LOG_TAG, "Invalid E-MAIL ADDRESS!");
                        emailTextField.setText("");
                    }
                }
            }
        });

        phoneField.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean b)
            {
                if(!phoneField.getText().toString().isEmpty())
                {
                    String phoneNumberValidationCode = "^(?:(?:\\+?([0-9]{1,2}?)\\s*(?:[.-]\\s*)?)?(?:\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+))?$";
                    String phoneNumber = phoneField.getText().toString();
                    if(phoneNumber.length()<10 || phoneNumber.length()>13 || !phoneNumber.matches(phoneNumberValidationCode))
                    {
                        Toast.makeText(getApplicationContext(), "Invalid PHONE NUMBER!", Toast.LENGTH_SHORT).show();
                        Log.d(LOG_TAG, "Invalid PHONE NUMBER!");
                        phoneField.setText("");
                    }
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == GALLERY_PIC && resultCode == RESULT_OK && null != data){
            imageUri = data.getData();
            if(imageUri != null)
            {
                Picasso.get().load(imageUri).into(imageView);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle state){
        Log.d(LOG_TAG, "BUNDLE SAVE has started !");
        super.onSaveInstanceState(state);
        if(!nameField.getText().toString().isEmpty())
            state.putString("name", nameField.getText().toString());
        if(!surnameField.getText().toString().isEmpty())
            state.putString("surname", surnameField.getText().toString());
        if(!birthPlaceField.getText().toString().isEmpty())
            state.putString("birthPlace", birthPlaceField.getText().toString());
        if(!birthDateField.getText().toString().isEmpty())
            state.putString("birthDate", birthDateField.getText().toString());
        if(!citizenNoField.getText().toString().isEmpty())
            state.putString("citizenNo", citizenNoField.getText().toString());
        if(!phoneField.getText().toString().isEmpty())
            state.putString("phone", phoneField.getText().toString());
        if(!emailTextField.getText().toString().isEmpty())
            state.putString("phone", emailTextField.getText().toString());
        if(imageView.getDrawable() != null && imageUri != null)
            state.putString("image", imageUri.toString());
        Log.d(LOG_TAG, "BUNDLE SAVE has finished !");
    }

    public void startSubmitActivity(Intent submitIntent){
        if(!nameField.getText().toString().isEmpty())
            submitIntent.putExtra("name", nameField.getText().toString());
        if(!surnameField.getText().toString().isEmpty())
            submitIntent.putExtra("surname", surnameField.getText().toString());
        if(!birthPlaceField.getText().toString().isEmpty())
            submitIntent.putExtra("birthPlace", birthPlaceField.getText().toString());
        if(!birthDateField.getText().toString().isEmpty())
            submitIntent.putExtra("birthDate", birthDateField.getText().toString());
        if(!citizenNoField.getText().toString().isEmpty())
            submitIntent.putExtra("citizenNo", citizenNoField.getText().toString());
        if(!phoneField.getText().toString().isEmpty())
            submitIntent.putExtra("phone", phoneField.getText().toString());
        if(!emailTextField.getText().toString().isEmpty())
            submitIntent.putExtra("email", emailTextField.getText().toString());
        if(imageView.getDrawable() != null && imageUri != null)
            submitIntent.putExtra("image", imageUri.toString());
        startActivity(submitIntent);
    }

    public void showDatePicker(){
        Calendar myCalendar = Calendar.getInstance();
        int year = myCalendar.get(Calendar.YEAR);
        int month = myCalendar.get(Calendar.MONTH);
        int day = myCalendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog myDialog = new DatePickerDialog(FormActivity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth, myDateSetListener, year, month, day);
        Objects.requireNonNull(myDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}