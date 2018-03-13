package com.example.android.vgamequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class VGameQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vgame_quiz);
    }

    public void verify (View view) {
        int correctAnswers = 0;
        CheckBox check1 = (CheckBox) findViewById(R.id.checkbox1990);
        CheckBox check2 = (CheckBox) findViewById(R.id.checkbox1994);
        CheckBox check3 = (CheckBox) findViewById(R.id.checkbox2000);

        if (check2.isChecked() & check3.isChecked()) {
            correctAnswers +=1;
        } else {
            correctAnswers +=0;
        }


        CheckBox check4 = (CheckBox) findViewById(R.id.checkbox_RC);
        CheckBox check5 = (CheckBox) findViewById(R.id.checkbox_GOW);
        CheckBox check6 = (CheckBox) findViewById(R.id.checkbox_MK);

        if (check4.isChecked() & check5.isChecked()) {
            correctAnswers +=1;
        } else {
            correctAnswers +=0;
        }



        RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.Radio_group_console);
        if (radioGroup.getCheckedRadioButtonId() ==R.id.tetris) {
            correctAnswers+=1;
        } else {
            correctAnswers +=0;
        }

        EditText editText = (EditText) findViewById(R.id.edit_text_2);
        if (editText.getText().toString().equalsIgnoreCase("Square Enix")) {
            correctAnswers+=1;
        } else {
            correctAnswers +=0;
        }

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.Radio_group_JV);
        if (radioGroup2.getCheckedRadioButtonId() ==R.id.E3){
            correctAnswers+=1;
        } else {
            correctAnswers +=0;
        }

        EditText editText1 = (EditText) findViewById(R.id.edit_text_fortnite);
        if (editText1.getText().toString().equalsIgnoreCase("Fortnite")) {
            correctAnswers+=1;
        } else {
            correctAnswers +=0;
        }

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.Radio_group_TR);
        if (radioGroup1.getCheckedRadioButtonId() ==R.id.lara){
            correctAnswers+=1;
        } else {
            correctAnswers +=0;
        }



        Toast.makeText(getApplicationContext(),"Result: "+String.valueOf(correctAnswers)+ " correct answers out of 7.",Toast.LENGTH_LONG).show();
    }
}

