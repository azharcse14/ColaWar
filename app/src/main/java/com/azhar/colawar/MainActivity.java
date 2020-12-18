package com.azhar.colawar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pVote = 0;
    int ccVote = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void pepsi(View view){
        pVote = pVote + 1;
        pepsiDisplay(pVote);
        pepsiDifCocaColaDisplay(pVote-ccVote);
    }

    public void cocaCola(View view){
        ccVote = ccVote+1;
        cocaColaDisplay(ccVote);
        cocaColaDifPepsiDisplay(ccVote-pVote);
    }

    public void pepsiDifCocaColaDisplay(int i){
        TextView textView = findViewById(R.id.pdTv);
        textView.setText(""+i);
    }

    public void cocaColaDifPepsiDisplay(int i){
        TextView textView = findViewById(R.id.ccdTv);
        textView.setText(""+i);
    }

    public void pepsiDisplay(int i){
        TextView textView = findViewById(R.id.pepsiDisplayTv);
        textView.setText(""+i);
    }

    public void cocaColaDisplay(int i){
        TextView textView = findViewById(R.id.cocaColaDisplayTv);
        textView.setText(""+i);
    }
}