package com.example.winit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {
    private Button faqbutton;
    private ImageButton calendarbutton;
    private Button donatebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       calendarbutton=findViewById(R.id.calendarbutton) ;
       calendarbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent calintent=new Intent(HomeActivity.this,calendarActivity.class);
               startActivity(calintent);
           }
       });
       donatebutton=findViewById(R.id.donatebutton);
       donatebutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent donateintent=new Intent(HomeActivity.this,donateActivity.class);
               startActivity(donateintent);
           }
       });










        faqbutton=findViewById(R.id.faqbutton);
        faqbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openfaqpage();
            }
        });
    }
    public void openfaqpage(){
        Intent catintent=new Intent(this,FaqActivity.class);
        startActivity(catintent);
    }
}