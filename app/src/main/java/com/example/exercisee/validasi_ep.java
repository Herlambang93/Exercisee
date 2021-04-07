package com.example.exercisee;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class validasi_ep extends AppCompatActivity {
    TextView txEmail, txPassword;
    String Name, Password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validasi_ep);
        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);
        Bundle bl2 = this.getIntent().getExtras();
        Name = bl2.getString("parameter");
        Password = bl2.getString("parameter2");

        txEmail.setText(Name);
        txPassword.setText(Password);

    }
}
