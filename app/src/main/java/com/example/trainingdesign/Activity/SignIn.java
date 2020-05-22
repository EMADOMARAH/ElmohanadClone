package com.example.trainingdesign.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.trainingdesign.R;
import com.google.android.material.textfield.TextInputEditText;

public class SignIn extends AppCompatActivity {
    TextInputEditText phone , password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        phone = findViewById(R.id.phone_field);
        password = findViewById(R.id.password_field);




    }

    public void fogetPassword(View view)
    {
        startActivity(new Intent(getApplicationContext(), PassWordRecovry.class));
    }

    public void Registeration(View view)
    {
        startActivity(new Intent(getApplicationContext(), SignUp.class));
    }

    public void habd(View view) {

        if (phone.isFocused())
        {
            phone.setError("اكتب رقم عدل يبشه");
        }

        if (password.isFocused())
        {
            password.setError("اكتب  باسورد عدل ");
        }
    }
}
