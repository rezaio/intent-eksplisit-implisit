package com.reza.praktikum3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MoveWithDataActivity extends AppCompatActivity {
    public static final String EXTRA_KELAS = "extra_kelas";
    public static final String EXTRA_KULIAH = "extra_kuliah";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TextView tvDataReceived = findViewById(R.id.tv_data_received);

        String kuliah = getIntent().getStringExtra(EXTRA_KULIAH);
        int kelas = getIntent().getIntExtra(EXTRA_KELAS,0);
        String text = "Mata Kuliah :" + kuliah +", Kelas : " + kelas;
        tvDataReceived.setText(text);
    }
}