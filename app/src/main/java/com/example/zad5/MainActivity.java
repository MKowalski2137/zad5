package com.example.domekwgrach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int licznikpolub = 0;
    private TextView licznikpolubtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        licznikpolubtext = findViewById(R.id.licznikpolub);
        Button polub = findViewById(R.id.polub);
        Button usun = findViewById(R.id.usun);

        polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                licznikpolub++;
                updateLikeCount();
            }
        });

        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznikpolub > 0) {
                    licznikpolub--;
                    updateLikeCount();
                }
            }
        });
    }
    private void updateLikeCount() {
        licznikpolubtext.setText(licznikpolub + " polubień");
    }
}
