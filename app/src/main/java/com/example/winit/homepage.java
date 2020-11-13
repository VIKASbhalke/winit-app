package com.example.winit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class homepage extends AppCompatActivity {
private ImageButton faqs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        faqs=(ImageButton)findViewById(R.id.faqs);
        faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfaqpage();
            }
        });


    }
    public  void openfaqpage(){
        Intent openf=new Intent(this,faqpage.class);
        startActivity(openf);
    }

    }
