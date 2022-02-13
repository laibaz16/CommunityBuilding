package com.example.communitybuilding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Teen_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teen_page);
    }

    public void speedclick(View v) {
        TextView speedtext = (TextView) findViewById(R.id.Speedfriending);
        speedtext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageButton speedimage = (ImageButton) findViewById(R.id.speedimage);
        speedimage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }

    public void talentshowclick(View v) {

        TextView talenttext = (TextView) findViewById(R.id.talentshow);
        talenttext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageButton talentshowclick = (ImageButton) findViewById(R.id.talentimage);
        talentshowclick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);            }

        });
    }

    public void paintclick(View v) {

        TextView painttext = (TextView) findViewById(R.id.paint);
        painttext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageButton talentshowclick = (ImageButton) findViewById(R.id.paintimage);
        talentshowclick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Uri uri = Uri.parse("https://yorku.zoom.us/j/5833170844?pwd=dmpqblU5VFRQZjFsMjNjTE0vZlZhdz09"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}