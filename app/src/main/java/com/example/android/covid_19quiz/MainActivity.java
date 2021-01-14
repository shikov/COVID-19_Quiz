package com.example.android.covid_19quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = findViewById(R.id.submit);
        submitButton.setOnClickListener(v -> submit(v));

    }

    protected void submit(View view) {
        int score = 0;
        // check question 1 answer
        RadioGroup radioButtonGroup = findViewById(R.id.question_01_options);
        int radioButtonID = radioButtonGroup.getCheckedRadioButtonId();
        View radioButton = radioButtonGroup.findViewById(radioButtonID);
        int idx = radioButtonGroup.indexOfChild(radioButton);
        if (idx == 0) score++;

        // show result
        Toast.makeText(getApplicationContext(), "Your score: " + score + "/10", Toast.LENGTH_LONG).show();
    }
}