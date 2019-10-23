package com.example.textscrolling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createComment(View view){
        EditText comment = findViewById(R.id.comment);
        comment.setVisibility(View.VISIBLE);
    }
}
