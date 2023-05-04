package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.page1_button1);
        Button button2 = (Button) findViewById(R.id.page1_button2);
        Button button3 = (Button) findViewById(R.id.page1_button3);
        Button button4 = (Button) findViewById(R.id.page1_button4);
        Button button5 = (Button) findViewById(R.id.page1_button5);

        ImageView image1 = (ImageView) findViewById(R.id.fab3);
        ImageView image2 = (ImageView) findViewById(R.id.fab4);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "https://henricoprevention.org/youth-leadership/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "https://henricoprevention.org/resources/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "https://henricoprevention.org/service-partners/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "https://www.instagram.com/henricotoosmart/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "https://www.youtube.com/channel/UCPoL8cFoxCdPlZFsa8YoLlQ";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        image1.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               String url = "https://henricoprevention.org/";
               Intent intent = new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse(url));
               startActivity(intent);
           }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "https://henrico.us/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}