package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void dropIn(View view){

        ImageView counter = (ImageView) view;

        counter.setTranslationY(-1000);
        counter.setImageResource(R.drawable.tic_tac_two);
        counter.animate().translationYBy(1000).setDuration(300);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}