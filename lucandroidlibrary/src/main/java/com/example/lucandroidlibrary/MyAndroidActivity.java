package com.example.lucandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyAndroidActivity extends AppCompatActivity {
    public static final String JOKE_KEY = "Joke_Intent_Key";
    private TextView displayJoke;
    private String stringJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_android_library);
        //getting the intent and display the joke.
        if (getIntent().hasExtra(MyAndroidActivity.JOKE_KEY)) {
            stringJoke = getIntent().getStringExtra(MyAndroidActivity.JOKE_KEY);
            displayJoke = findViewById(R.id.joke_text_view);
            displayJoke.setText(stringJoke);
        }
    }
}
