package com.example.winit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;

public class FaqActivity extends AppCompatActivity {
private ImageButton lungcanbutton;
private ImageButton colcanbutton;
private ImageButton brecanbutton;
private ImageButton skincanbutton;
private ImageButton prcanbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        prcanbutton=findViewById(R.id.prcanbutton);
        prcanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pr=new Intent(FaqActivity.this,prostratecanActivity.class);
                startActivity(pr);
            }
        });
        skincanbutton=findViewById(R.id.skincanbutton);
        skincanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skintent=new Intent(FaqActivity.this,skincancerActivity.class);
                startActivity(skintent);
            }
        });
        brecanbutton=findViewById(R.id.brecanbutton);
        brecanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent breintent=new Intent(FaqActivity.this,brecancerActivity.class);
                startActivity(breintent);
            }
        });
        colcanbutton=findViewById(R.id.colcanbutton);
        colcanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colintent=new Intent(FaqActivity.this,coloreccanActivity.class);
                startActivity(colintent);
            }
        });
        lungcanbutton=findViewById(R.id.lungcanbutton);
        lungcanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lintent=new Intent(FaqActivity.this,lungcanActivity.class);
                startActivity(lintent);
            }
        });
    }
}