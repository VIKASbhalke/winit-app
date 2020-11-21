package com.example.winit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    private ImageButton donatebutton;
    private ImageButton faq;
    private ImageButton feedback;
    private ImageButton contact;
    private ImageButton schedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        schedule=findViewById(R.id.schedule);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent calintent=new Intent(HomeActivity.this,calendarActivity.class);
              startActivity(calintent);
            }
        });
        contact=findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactin=new Intent(HomeActivity.this,contactActivity.class);
                startActivity(contactin);
            }
        });
        feedback=findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent feedbackin=new Intent(HomeActivity.this,feedbackActivity.class);
                startActivity(feedbackin);
            }
        });
        faq=findViewById(R.id.faq);
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent faqintent=new Intent(HomeActivity.this,FaqActivity.class);
                startActivity(faqintent);
            }
        });

        donatebutton = findViewById(R.id.donatebutton);
        donatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent donateintent = new Intent(HomeActivity.this, donateActivity.class);
                startActivity(donateintent);
            }
        });

    }
}









