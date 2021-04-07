package com.example.exercisee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActLihatData extends AppCompatActivity {
    public static String nomorhp;
    TextView tvnama,tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_lihat_data);


        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");
        setContentView(R.layout.activity_act_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama)
        {
            case "Inayah" :
                tvnama.setText("Inayah M");
                tvnomor.setText("0812223344");
                nomorhp = tvnomor.getText().toString();
                break;

            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("081333224455");
                nomorhp = tvnomor.getText().toString();
                break;

            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("08125533344");
                nomorhp = tvnomor.getText().toString();
                break;

            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("0812245334");
                nomorhp = tvnomor.getText().toString();
                break;

            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("08126633344");
                nomorhp = tvnomor.getText().toString();
                break;

            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("08122555344");
                nomorhp = tvnomor.getText().toString();
                break;

            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("08125556344");
                nomorhp = tvnomor.getText().toString();
                break;

            case "Gita" :
                tvnama.setText("Gita S");
                tvnomor.setText("08199233344");
                nomorhp = tvnomor.getText().toString();
                break;

            case "Lutfi" :
                tvnama.setText("Lutfi M");
                tvnomor.setText("08122233234");
                nomorhp = tvnomor.getText().toString();
                break;

            case "Vian" :
                tvnama.setText("Vian M");
                tvnomor.setText("08122969344");
                nomorhp = tvnomor.getText().toString();
                break;
        }
    }
}