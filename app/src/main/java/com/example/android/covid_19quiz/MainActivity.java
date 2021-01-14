package com.example.android.covid_19quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = findViewById(R.id.submit);
        submitButton.setOnClickListener(this::submit);
    }

    protected void submit(View view) {
        int score = 0;
        // check question 1 answer
        RadioGroup radioButtonGroup = findViewById(R.id.question_01_options);
        int radioButtonID = radioButtonGroup.getCheckedRadioButtonId();
        View radioButton = radioButtonGroup.findViewById(radioButtonID);
        int idx = radioButtonGroup.indexOfChild(radioButton);
        if (idx == 0) score++;

        // check question 2 answer
        radioButtonGroup = findViewById(R.id.question_02_options);
        radioButtonID = radioButtonGroup.getCheckedRadioButtonId();
        radioButton = radioButtonGroup.findViewById(radioButtonID);
        idx = radioButtonGroup.indexOfChild(radioButton);
        if (idx == 3) score++;

        // check question 3 answer
        radioButtonGroup = findViewById(R.id.question_03_options);
        radioButtonID = radioButtonGroup.getCheckedRadioButtonId();
        radioButton = radioButtonGroup.findViewById(radioButtonID);
        idx = radioButtonGroup.indexOfChild(radioButton);
        if (idx == 0) score++;

        // check question 4 answer
        EditText editText = findViewById(R.id.question_04_answer);
        if (editText.getText().toString().equals("20")) score++;

        // check question 5 answer
        CheckBox checkBox01 = findViewById(R.id.question_05_checkBox_01);
        CheckBox checkBox02 = findViewById(R.id.question_05_checkBox_02);
        CheckBox checkBox03 = findViewById(R.id.question_05_checkBox_03);
        CheckBox checkBox04 = findViewById(R.id.question_05_checkBox_04);
        if (!checkBox01.isChecked() && checkBox02.isChecked()
                && checkBox03.isChecked() && !checkBox04.isChecked())
            score++;

        // check question 6 answer
        radioButtonGroup = findViewById(R.id.question_06_options);
        radioButtonID = radioButtonGroup.getCheckedRadioButtonId();
        radioButton = radioButtonGroup.findViewById(radioButtonID);
        idx = radioButtonGroup.indexOfChild(radioButton);
        if (idx == 0) score++;

        // check question 7 answer
        radioButtonGroup = findViewById(R.id.question_07_options);
        radioButtonID = radioButtonGroup.getCheckedRadioButtonId();
        radioButton = radioButtonGroup.findViewById(radioButtonID);
        idx = radioButtonGroup.indexOfChild(radioButton);
        if (idx == 3) score++;

        // check question 8 answer
        radioButtonGroup = findViewById(R.id.question_08_options);
        radioButtonID = radioButtonGroup.getCheckedRadioButtonId();
        radioButton = radioButtonGroup.findViewById(radioButtonID);
        idx = radioButtonGroup.indexOfChild(radioButton);
        if (idx == 2) score++;

        // show result
        Toast.makeText(getApplicationContext(), "Your score: " + score + "/8", Toast.LENGTH_SHORT).show();
    }
}