package com.apkglobal.tourismguide;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendMail extends AppCompatActivity {
   String email_str,feedback_str,subject_str;
    EditText email, feedback,subject;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_mail);


        email = (EditText) findViewById(R.id.email);
        feedback = (EditText) findViewById(R.id.feedback);
        subject=(EditText)findViewById(R.id.subject);
        send = (Button) findViewById(R.id.send);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Sendmail();

            }

        });


    }

    private void Sendmail() {
        //Getting content for email

        email_str=email.getText().toString();
        feedback_str =feedback.getText().toString();
        subject_str=subject.getText().toString();
      int flag=0;
        if( email.getText().toString().trim().equals("")) {
            email.setError("Email is required!");
            flag=1;
        }
        if( feedback.getText().toString().trim().equals("")) {
            feedback.setError("Feedback is required!");
            flag=1;
        }
        if(subject.getText().toString().trim().equals("")) {
            subject.setError("Subject is required!");
            flag=1;
        }

        //Creating SendMail object
        SendEmail sm = new SendEmail(this, subject_str, feedback_str.concat("  send by "+email_str));

        //Executing sendmail to send email
        if(flag==0)
           sm.execute();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.navigation_feed_back:
                    Intent intent1=new Intent(getApplicationContext(),SendMail.class);
                    startActivity(intent1);
                    break;
                case R.id.navigation_about_us:

                    Intent intent2=new Intent(getApplicationContext(),About.class);
                    startActivity(intent2);
                    break;
            }
            return false;
        }

    };


}

