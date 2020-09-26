package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_pelamar_resume extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelamar_resume);

        Button btnresume = (Button) findViewById(R.id.kirimResume);
        btnresume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kirimresume = new Intent(getApplicationContext(),layout_pelamar_sukses.class);
                startActivity(kirimresume);
            }
        });

    }
}
