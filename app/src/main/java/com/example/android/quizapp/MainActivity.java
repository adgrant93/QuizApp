package com.example.android.quizapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.android.quizapp.wirelessQuiz;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.android.quizapp";
    public static final String EXTRA_SCORE = "com.example.android.quizapp";
//    WebView google;
    int pageCount_INT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView page = (TextView) findViewById(R.id.page);
        page.setText(Integer.toString(pageCount_INT));
    }

    /**
     *
     * @param view the view of the button
     */
    public void page2 (View view){

        pageCount_INT++;
        Intent intent = new Intent(this, wirelessQuiz.class);
        intent.putExtra(EXTRA_MESSAGE, Integer.toString(pageCount_INT));
        startActivity(intent);
    }
}

