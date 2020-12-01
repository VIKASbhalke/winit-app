package com.example.winit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class feedbackActivity extends AppCompatActivity {
 EditText enterusern;
 EditText feedbacksubmit;
 Button  send_feedback;
    DatabaseReference databaseuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        databaseuser= FirebaseDatabase.getInstance().getReference();
        enterusern=findViewById(R.id.enterusern);
        feedbacksubmit=findViewById(R.id.feedbacksubmit);
        send_feedback=findViewById(R.id.send_feedback);
        send_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adduser();
            }
        });
    }
    private void adduser(){
        String names=enterusern.getText().toString().trim();
        String feedbacks=feedbacksubmit.getText().toString().trim();
        if(!TextUtils.isEmpty(names)){
           String id=databaseuser.push().getKey();
           user xyz=new user(id,names,feedbacks);
           databaseuser.child(id).setValue(xyz);
            Toast.makeText(this, "data stored successfully", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"you should enter name",Toast.LENGTH_LONG).show();
        }
    }
}