package com.example.communitybuilding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Teen_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teen_page);
    }
    public void text_msg(View v){
        Toast.makeText(getApplicationContext(), "Joining", Toast.LENGTH_LONG).show();
    }
}