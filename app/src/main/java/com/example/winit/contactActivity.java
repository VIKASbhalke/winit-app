package com.example.winit;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class contactActivity extends AppCompatActivity {

    // define objects for edit text and button
    private Button send_email;
    EditText send_to,email_subject,email_body ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send_to = findViewById(R.id.editTextEmailAddress);
        email_subject = findViewById(R.id.PersonName2);
        email_body = findViewById(R.id.editTextPersonName);
        send_email = findViewById(R.id.send_email);

        // attach setOnClickListener to button
        // with Intent object define in it
        send_email.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                String emailsend= send_to.getText().toString();
                String emailsubject = email_subject.getText().toString();
                String emailbody = email_body.getText().toString();

                // define Intent object
                // with action attribute as ACTION_SEND
                Intent conintent = new Intent(Intent.ACTION_SEND);

                conintent.putExtra(Intent.EXTRA_EMAIL,
                        new String[] { emailsend });
                conintent.putExtra(Intent.EXTRA_SUBJECT, emailsubject);
                conintent.putExtra(Intent.EXTRA_TEXT, emailbody);
                conintent.setType("message/rfc822");
                startActivity(
                        Intent.createChooser(conintent, "Choose an Email client :"));
            }
        });
    }
}