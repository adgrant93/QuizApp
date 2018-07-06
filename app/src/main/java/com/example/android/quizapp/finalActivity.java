package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

//import static com.example.android.quizapp.wirelessQuiz.EXTRA_MESSAGE;

public class finalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
//        Intent intent = getIntent();
//        TextView page3 = (TextView) findViewById(R.id.page3);
//        page3.setText(intent.getStringExtra(EXTRA_MESSAGE));
    }
}
