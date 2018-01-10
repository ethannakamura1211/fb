package com.example.istworkshop.internship1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText u,p;
    Button b;
    public void s_up(View v1)
    {
        Intent i1 = new Intent(MainActivity.this,SignUp.class);
        startActivity(i1);
    }

    public void move_to(View v)
    {
        if(TextUtils.isEmpty(u.getText().toString()) || TextUtils.isEmpty(p.getText().toString()))

        {
            Toast.makeText(getApplicationContext(),"Enter username and Password", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(MainActivity.this, Main2Activity.class);

          i.putExtra("user", u.getText().toString());
            startActivity(i);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        u=findViewById(R.id.editText);
        p=findViewById(R.id.editText2);

    }
}
