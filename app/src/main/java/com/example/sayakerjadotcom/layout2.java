package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Button btnregist = (Button) findViewById(R.id.regist);
        btnregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(),layout_daftar.class);
                startActivity(i2);
            }
        });

        Button btnmasuklogin = (Button) findViewById(R.id.masuklogin);
        btnmasuklogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukLogin = new Intent(getApplicationContext(),layout_pilih.class);
                startActivity(masukLogin);
            }
        });
    }
}
