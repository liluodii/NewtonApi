package com.example.newtonapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final Intent myIntent2=new Intent(Login.this,MainActivity.class);

        final EditText username = findViewById(R.id.edtemail);
        final TextView message=findViewById(R.id.tvmessage);
        final EditText password = findViewById(R.id.edtpassword);
        final Button login = findViewById(R.id.btnsignin);

        login.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {


                                         String inputid = username.getText().toString();
                                         String inputpassword = password.getText().toString();

                                         if(inputid.equals("newton@gmail.com") && inputpassword.equals("n123"))
                                         {
                                             startActivity(myIntent2);
                                         }
                                         else
                                         {
                                             message.setText("Enter Valid Email and Password...!!!");
                                         }

                                     }

                                 }


        );
    }
}
