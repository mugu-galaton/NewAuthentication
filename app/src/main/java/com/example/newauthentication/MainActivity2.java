package com.example.newauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText fname, lname, DOB, mailID, phone;
    private Button otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        DOB = findViewById(R.id.dob);
        mailID = findViewById(R.id.mailid);
        phone = findViewById(R.id.phone);
        otp = findViewById(R.id.otp);

        otp.setOnClickListener(view ->{

        });


    }
    private boolean validate(){
        String firstname, lastname, dob, mail, pnumber;

        firstname = fname.getText().toString();
        lastname = lname.getText().toString();
        dob = DOB.getText().toString();
        mail = mailID.getText().toString();
        pnumber = phone.getText().toString();

//        if (firstname)
        return false;
    }
}