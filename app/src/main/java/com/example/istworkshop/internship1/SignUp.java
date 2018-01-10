package com.example.istworkshop.internship1;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class SignUp extends AppCompatActivity {

    private AwesomeValidation validation;

    EditText u_name,mobile,email;
    Button submit;
    Spinner country;
    RadioButton m,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        validation = new AwesomeValidation(ValidationStyle.BASIC);
        validation.addValidation(this, R.id.editText3, "[a-zA-Z\\\\s]+", R.string.name_error);
        validation.addValidation(this, R.id.editText7, Patterns.EMAIL_ADDRESS, R.string.email_error);
        validation.addValidation(this, R.id.editText5, RegexTemplate.TELEPHONE, R.string.number_error);

        u_name = findViewById(R.id.editText3);
        email = findViewById(R.id.editText7);
        mobile = findViewById(R.id.editText5);
        country= findViewById(R.id.spinner);
        m=findViewById(R.id.radioButton);
        f=findViewById(R.id.radioButton2);

    }


    public void checkforval(View view) {
        if (validation.validate()) {
            Intent i = new Intent(SignUp.this, Main2Activity.class);

            i.putExtra("username",u_name.getText().toString());
            i.putExtra("email",email.getText().toString());
            i.putExtra("mobile", mobile.getText().toString());
            i.putExtra("country", country.getSelectedItem().toString());
            if(m.isChecked())
            {
                i.putExtra("gender", m.getText().toString());

            }
            else
            {
                i.putExtra("gender", f.getText().toString());
            }
            startActivity(i);
        }

    }
}