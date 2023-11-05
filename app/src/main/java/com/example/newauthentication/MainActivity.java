package com.example.newauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user_name;
    private EditText password;
    private Button check;
    private TextView create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_name=findViewById(R.id.mailid);
        password=findViewById(R.id.password);
        check=findViewById(R.id.b1);
        create_account=findViewById(R.id.createaccount);
        listener();

    }

    private void listener(){
        create_account.setOnClickListener(view ->{
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });

        check.setOnClickListener(view ->{
            if(validate()){
                Toast.makeText(this, "SUCCESS", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean validate(){
        String user = user_name.getEditableText().toString();
        String pass = password.getEditableText().toString();
        if(!user.isEmpty() && user.length()>5){
            String pattern="^"+"(?=.*[a-zA-Z])"+"(?=\\S+$)"+".{6,}"+"$";
            if(pass.matches(pattern)){
                return true;
            }
        }
        return false;
    }
}
