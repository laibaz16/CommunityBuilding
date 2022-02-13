package com.example.communitybuilding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Adult_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adult_page);
    }

    public void fitnessclick(View v) {

        TextView fitness_text = (TextView) findViewById(R.id.fitness);
        fitness_text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageButton fitnessimage = (ImageButton) findViewById(R.id.fitnessimage);
        fitnessimage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    public void mentalhealthclick(View v) {

        TextView healthtext = (TextView) findViewById(R.id.mentalhealth);
        healthtext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageButton healthimage = (ImageButton) findViewById(R.id.mentalhealthimage);
        healthimage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }


}