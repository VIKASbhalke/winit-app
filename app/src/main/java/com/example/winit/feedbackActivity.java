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
 EditText your_name;
 EditText type_feedback;
 Button  send_feedback;
    DatabaseReference databasereference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        databasereference= FirebaseDatabase.getInstance().getReference("users");
        your_name=findViewById(R.id.your_name);
        type_feedback=findViewById(R.id.type_feedback);
        send_feedback=findViewById(R.id.send_feedback);
        send_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adduser();
            }
        });
    }
    private void adduser(){
        String username=your_name.getText().toString().trim();
        String userfeedback=type_feedback.getText().toString().trim();
        if(!TextUtils.isEmpty(username)){
           String id=databasereference.push().getKey();
           user xyz=new user(id,username,userfeedback);
           databasereference.child(id).setValue(xyz);
            Toast.makeText(this, "data stored successfully", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"you should enter name",Toast.LENGTH_LONG).show();
        }
    }
}