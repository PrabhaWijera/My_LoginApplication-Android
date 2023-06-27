package com.example.myloginapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView userName= (TextView) findViewById(R.id.username);
        TextView password= (TextView) findViewById(R.id.password);
        Button loginbtn=(Button) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userName.getText().toString().equals("admin") && password.getText().toString().equals("1234") ){
                    //correct
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFULL",Toast.LENGTH_SHORT).show();
                }else {
                    //incorrect
                    Toast.makeText(MainActivity.this,"LOGIN WRONG !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}