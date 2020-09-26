package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_detail_job extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_job);

        Button btnlamarkerja = (Button) findViewById(R.id.lamarkerja);
        btnlamarkerja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lamarKerja = new Intent(getApplicationContext(), layout_pelamar_resume.class);
                startActivity(lamarKerja);
            }
        });
    }

}
