package com.example.glenyoung.word_counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WordCount extends AppCompatActivity {
    EditText sentenceText;
//    TextView answerText;
    Button countWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        Log.d(getClass().toString(), "onCreate called");

        sentenceText = (EditText) findViewById(R.id.string_text);
//        answerText = (TextView) findViewById(R.id.number_of_words);
        countWords = (Button) findViewById(R.id.count_button);
    }

    public void onCountWordsButtonClicked(View button) {
        String sentence = sentenceText.getText().toString();
        Log.d(getClass().toString(), "onCountWordsButtonClicked was called");
        Log.d(getClass().toString(), "Sentence given: " + sentence);
        Counter counter = new Counter();
        int wordCount = counter.numberOfWords(sentence);
//        answerText.setText("" + wordCount);

        Intent intent = new Intent (this, AnswerActivity.class);
        intent.putExtra("word count", wordCount);

        startActivity(intent);
    }
}
