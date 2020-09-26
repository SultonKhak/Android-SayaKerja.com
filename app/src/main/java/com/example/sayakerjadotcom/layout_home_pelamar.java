package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_home_pelamar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pekerja);

        Button btnadminpenginapan = (Button) findViewById(R.id.adminpenginapan);
        btnadminpenginapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adminPenginapan = new Intent(getApplicationContext(),layout_detail_job.class);
                startActivity(adminPenginapan);
            }
        });

        Button btnpilihakun = (Button) findViewById(R.id.pilihakun);
        btnpilihakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pilihAkun = new Intent(getApplicationContext(),layout_pilih.class);
                startActivity(pilihAkun);
            }
        });

    }
}
