package com.tools.aytech.mobilprogramming1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Normalizer;

public class LoginActivity extends AppCompatActivity {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";
    private static final String LOG_TAG = LoginActivity.class.getSimpleName();
    private TextView usernameField;
    private TextView passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button signInButton = findViewById(R.id.signinButton);
        usernameField = findViewById(R.id.usernameTextField);
        passwordField = findViewById(R.id.passwordTextField);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean usernameIsValid = usernameField.getText().toString().equalsIgnoreCase(USERNAME);
                boolean passwordIsValid = passwordField.getText().toString().equalsIgnoreCase(PASSWORD);
                if(!usernameIsValid && !passwordIsValid)
                    Toast.makeText(getApplicationContext(), "USERNAME & PASSWORD is wrong !", Toast.LENGTH_SHORT).show();
                else if(usernameIsValid && !passwordIsValid)
                    Toast.makeText(getApplicationContext(), "PASSWORD is wrong !", Toast.LENGTH_SHORT).show();
                else if(!usernameIsValid && passwordIsValid)
                    Toast.makeText(getApplicationContext(), "USERNAME is wrong !", Toast.LENGTH_SHORT).show();
                else
                {
                    Intent loginIntent = new Intent(getApplicationContext(), FormActivity.class);
                    startActivity(loginIntent);
                    Log.d(LOG_TAG, "LOGIN is successful !");
                }
                Log.d(LOG_TAG, "LOGIN is unsuccessful !");
            }
        });
    }
}
