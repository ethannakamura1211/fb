package com.example.istworkshop.internship1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView hello;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String s="",s1;
        try {

            hello = findViewById(R.id.welcome);

            Bundle b = getIntent().getExtras();
            String u = b.getString("username");
            String e = b.getString("email");
            String m = b.getString("mobile");
            String c = b.getString("country");
            String g = b.getString("gender");


            String u1 = b.getString("user");
             s1 = "Welcome " + u1;
             s = "Welcome " + u + ". Your email ID is " + e + ", mobile no. is " + m + " and you are from "+ c + ", "+g;
            if(!u1.isEmpty())
            {
                hello.setText(s1);


            }

        }catch(Exception e){
            hello.setText(s);
        };











    }
}
