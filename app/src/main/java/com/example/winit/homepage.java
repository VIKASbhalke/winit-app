package com.example.winit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {
private Button faq_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        faq_btn=(Button) findViewById(R.id.faq_btn);
        faq_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfaqpage();
            }
        });
    }
    public void openfaqpage(){
        Intent faq=new Intent(this,faqpage.class);
        startActivity(faq);

    }
}