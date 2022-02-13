package com.example.communitybuilding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Senior_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_page);
    }
    public void exclick(View v) {

        TextView extext = (TextView) findViewById(R.id.exercise);
        extext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Senior_page.this, test.class));
            }
        });
        ImageButton eximage = (ImageButton) findViewById(R.id.excerciseimage);
        eximage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Senior_page.this, test.class));
            }
        });
    }

    public void seniormentalhealthclick(View v) {

        TextView seniormentalhealthtext = (TextView) findViewById(R.id.seniormentalhealth);
        seniormentalhealthtext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Senior_page.this, test.class));
            }
        });
        ImageButton seniormentalhealthimage = (ImageButton) findViewById(R.id.mentalhealth);
        seniormentalhealthimage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Senior_page.this, test.class));
            }
        });
    }

    public void teaclick(View v) {

        TextView teatext = (TextView) findViewById(R.id.tea);
        teatext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Senior_page.this, test.class));
            }
        });
        ImageButton teaimage = (ImageButton) findViewById(R.id.teaimage);
        teaimage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Senior_page.this, test.class));
            }
        });
    }

}