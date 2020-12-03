package com.example.winit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.net.Uri;

public class contactActivity extends AppCompatActivity {

    // define objects for edit text and button
    Button send_email;
    EditText email_id, subject, body_of_the_mail;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email_id = findViewById(R.id.email_id);
        subject = findViewById(R.id.subject);
        body_of_the_mail= findViewById(R.id.body_of_the_mail);
        send_email = findViewById(R.id.send_email);

        send_email.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view)
            {
                String emailsend = email_id.getText().toString();
                String emailsubject = subject.getText().toString();
                String emailbody = body_of_the_mail.getText().toString();


                Intent nintent = new Intent(Intent.ACTION_SEND);


                nintent.putExtra(Intent.EXTRA_EMAIL,
                        new String[] { emailsend });
                nintent.putExtra(Intent.EXTRA_SUBJECT, emailsubject);
                nintent.putExtra(Intent.EXTRA_TEXT, emailbody);

                // set type of intent
                nintent.setType("message/rfc822");

                // startActivity with intent with chooser
                // as Email client using createChooser function
                startActivity(
                        Intent
                                .createChooser(nintent,
                                        "Choose an Email client :"));
            }
        });
    }
}