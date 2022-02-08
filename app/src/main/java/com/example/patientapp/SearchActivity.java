package com.example.patientapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ed1=(EditText) findViewById(R.id.pcode2);
        ed2=(EditText) findViewById(R.id.pname2);
        ed3=(EditText) findViewById(R.id.address2);
        ed4=(EditText) findViewById(R.id.pmob2);
        ed5=(EditText) findViewById(R.id.dname2);
        b1=(AppCompatButton)findViewById(R.id.search);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}