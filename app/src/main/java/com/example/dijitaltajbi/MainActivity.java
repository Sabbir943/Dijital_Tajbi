package com.example.dijitaltajbi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tvcount;
    Button buttonsum,buttonsub,buttonreset;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        tvcount=findViewById(R.id.tvcount);
        buttonsum=findViewById(R.id.buttonsum);
        buttonsub=findViewById(R.id.buttonsub);
        buttonreset=findViewById(R.id.buttonreset);
        buttonsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tvcount.setText(String.valueOf(count));
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tvcount.setText(String.valueOf(count));
            }
        });
        buttonreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                tvcount.setText(String.valueOf(count));
            }
        });
    }
}