package com.example.communitybuilding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageButton eximage = (ImageButton) findViewById(R.id.excerciseimage);
        eximage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    public void seniormentalhealthclick(View v) {

        TextView seniormentalhealthtext = (TextView) findViewById(R.id.seniormentalhealth);
        seniormentalhealthtext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageButton seniormentalhealthimage = (ImageButton) findViewById(R.id.mentalhealth);
        seniormentalhealthimage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    public void teaclick(View v) {

        TextView teatext = (TextView) findViewById(R.id.tea);
        teatext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageButton teaimage = (ImageButton) findViewById(R.id.teaimage);
        teaimage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

}