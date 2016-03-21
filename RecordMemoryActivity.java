package com.example.kaylie.todaysucks;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class RecordMemoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_memory);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String memory = intent.getStringExtra(Choose.EXTRA_MESSAGE);
        Choose.memories.add(memory);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(memory);
        LinearLayout layout = (LinearLayout) findViewById(R.id.content);
        layout.addView(textView);
    }







}

