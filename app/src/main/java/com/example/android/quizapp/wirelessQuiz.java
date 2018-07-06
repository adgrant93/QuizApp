package com.example.android.quizapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.quizapp.MainActivity.EXTRA_MESSAGE;

public class wirelessQuiz extends AppCompatActivity {

    int score = 0;
    int totalQ = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wireless_quiz);
        Intent intent = getIntent();
        TextView page2 = (TextView) findViewById(R.id.page2);
        page2.setText(intent.getStringExtra(EXTRA_MESSAGE));
    }

    public void points (View view){
        RadioButton toggle5 = findViewById(R.id.toggle5);
        CheckBox chkWifi = (CheckBox) findViewById(R.id.chkWIFI);
        CheckBox chkBlueT = (CheckBox) findViewById(R.id.chkBlueT);
        EditText classAnswer = (EditText) findViewById(R.id.classAnswer);
        String answer = classAnswer.getText().toString().toLowerCase().trim();
        RadioButton wifiAC = findViewById(R.id.ACwifi);

        if(toggle5.isChecked()) {
            score++;
        }

        if(chkWifi.isChecked() && chkBlueT.isChecked()){
            score++;
        }

        if(answer.equals("class2") || answer.equals("class 2")){
            score++;
        }

        if(wifiAC.isChecked()){
            score++;
        }

        Log.v("score: ",Integer.toString(score));
        Toast toast = Toast.makeText(this, "You got " + score + "/" + totalQ + " correct!" , Toast.LENGTH_SHORT);
        toast.show();
        score = 0;
    }



}
