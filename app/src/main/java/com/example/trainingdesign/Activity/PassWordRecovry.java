package com.example.trainingdesign.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.trainingdesign.R;

public class PassWordRecovry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pass_word_recovry);
    }

    public void ToSignIn(View view)
    {
        startActivity(new Intent(getApplicationContext(), SignIn.class));
    }
}
