package com.example.glenyoung.word_counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answerText = (TextView) findViewById(R.id.number_of_words);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("word count");
        answerText.setText(answer);

    }
}
