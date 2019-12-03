package com.rizkykhapidsyah.p_customtoast__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button B_CustomToast_IDJAVA;
    TextView TV_ToastCustom_IDJAVA;
    Toast RotiPanggang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_CustomToast_IDJAVA = findViewById(R.id.B_CustomToast_IDXML);
        TV_ToastCustom_IDJAVA = findViewById(R.id.TV_ToastCustom_IDXML);

        B_CustomToast_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RotiPanggang = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG);
                RotiPanggang.setGravity(Gravity.CENTER, 0, 0);
                View Lihat = getLayoutInflater().inflate(R.layout.toast_custom, (ViewGroup) findViewById(R.id.LAY_ToastCustom_IDXML));
                RotiPanggang.setView(Lihat);
                RotiPanggang.show();
            }
        });
    }
}
