package com.example.surajcalci;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.common.util.NumberUtils;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class secondpage extends AppCompatActivity {
    private Button plus,minus,mult,div,power,exit;
    private EditText val1;
    private EditText val2;
    private EditText res;
    FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference myref = db.getReference("Values");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        plus=(Button)findViewById(R.id.plus);
        minus=(Button)findViewById(R.id.minus);
        mult=(Button)findViewById(R.id.star);
        div=(Button)findViewById(R.id.slash);
        power=(Button)findViewById(R.id.cap);
      exit=(Button)findViewById(R.id.end);
        val1=(EditText)findViewById(R.id.eval1);
        val2=(EditText)findViewById(R.id.eval2);
        res=(EditText)findViewById(R.id.reval);
        //String num1=val1.getText().toString();
        //String num2=val2.getText().toString();
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub();
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multi();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                divi();
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end();
            }
        });

    }
    private void add()
    {
        //String num1=val1.getText().toString();
        //String num2=val2.getText().toString();
        String id = myref.push().getKey();
        double n1=Double.parseDouble(val1.getText().toString());
        double n2=Double.parseDouble(val2.getText().toString());
        double resul = n1+n2;
        //resul=n1+n2;
        res.setText(Double.toString(resul));
        database dat = new database(id,n1,n2,resul);
        myref.child(id).setValue(dat);

    }
    private void sub()
    {
        //String num1=val1.getText().toString();
        //String num2=val2.getText().toString();
        String id = myref.push().getKey();
        double n1=Double.parseDouble(val1.getText().toString());
        double n2=Double.parseDouble(val2.getText().toString());
        double resul = n1-n2;
        //resul=n1+n2;
        res.setText(Double.toString(resul));
        database dat = new database(id,n1,n2,resul);
        myref.child(id).setValue(dat);


    }
    private void multi()
    {
        //String num1=val1.getText().toString();
        //String num2=val2.getText().toString();
        String id = myref.push().getKey();
        double n1=Double.parseDouble(val1.getText().toString());
        double n2=Double.parseDouble(val2.getText().toString());
        double resul = n1*n2;
        //resul=n1+n2;
        res.setText(Double.toString(resul));
        database dat = new database(id,n1,n2,resul);
        myref.child(id).setValue(dat);


    }
    private void divi()
    {
        //String num1=val1.getText().toString();
        //String num2=val2.getText().toString();
        String id = myref.push().getKey();
        double n1=Double.parseDouble(val1.getText().toString());
        double n2=Double.parseDouble(val2.getText().toString());
        double resul = n1/n2;
        //resul=n1+n2;
        res.setText(Double.toString(resul));
        database dat = new database(id,n1,n2,resul);
        myref.child(id).setValue(dat);


    }
    private void exp()
    {
        //String num1=val1.getText().toString();
        //String num2=val2.getText().toString();
        String id = myref.push().getKey();
        double n1=Double.parseDouble(val1.getText().toString());
        double n2=Double.parseDouble(val2.getText().toString());
        double resul = Math.pow(n1, n2);
        //resul=n1+n2;
        res.setText(Double.toString(resul));
        database dat = new database(id,n1,n2,resul);
        myref.child(id).setValue(dat);


    }
    private void end(){
        System.exit(0);
    }
}