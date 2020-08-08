package com.example.surajcalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button Enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Enter=(Button)findViewById(R.id.enter);
        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  entering();
            }

        });

    }
    private void entering()
    {
        Intent intent=new Intent(MainActivity.this,secondpage.class);
        startActivity(intent);
    }
}
