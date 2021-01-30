package com.example.l3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageButton btniv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.img);
        btniv = (ImageButton) findViewById(R.id.btn);

    }

    public void changeImg(View view) {
        
        int rand = (int)(Math.random() * 3) + 1;
        System.out.print(rand);
        if (rand==1) {
            iv.setImageResource(R.drawable.fbam);
            btniv.setImageResource(R.drawable.bibamba);
        }else if(rand==2){
            iv.setImageResource(R.drawable.rbam);
            btniv.setImageResource(R.drawable.nahbamba);
        }else if(rand==3){
            iv.setImageResource(R.drawable.nbam);
            btniv.setImageResource(R.drawable.obamba);
        }
    }
}

