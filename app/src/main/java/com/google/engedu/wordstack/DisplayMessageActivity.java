package com.google.engedu.wordstack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String sw = getIntent().getStringExtra(MainActivity.SCRAMBLED_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText(sw);
    }
}
