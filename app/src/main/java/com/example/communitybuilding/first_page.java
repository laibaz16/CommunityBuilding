package com.example.communitybuilding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class first_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);


        Button teen_button = (Button) findViewById(R.id.teens);
        teen_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(first_page.this, Teen_page.class));
            }
        });
            Button adult_button = (Button) findViewById(R.id.Adult);
            adult_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(first_page.this, Adult_page.class));
            }
        });
        Button senior_button = (Button) findViewById(R.id.Senior);
        senior_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(first_page.this, Senior_page.class));
            }
        });
    }


}