package com.example.communitybuilding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button teen_btn = (Button) findViewById(R.id.TeenButton);
        teen_btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, Teen_page.class));
            }
        });

        Button adult_btn = (Button) findViewById(R.id.AdultButton);
        adult_btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, Teen_page.class));
            }
        });

        Button senior_btn = (Button) findViewById(R.id.SeniorButton);
        senior_btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, Teen_page.class));
            }
        });
    }
}

