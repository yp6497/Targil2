package com.example.targil2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int id[] = new int[3];
    ImageView[] iv = new ImageView[3];
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib = findViewById(R.id.ib);
        iv[0] = (ImageView) findViewById(R.id.iv1);
        iv[1] = (ImageView) findViewById(R.id.iv1);
        iv[2] = (ImageView) findViewById(R.id.iv1);

        id[0] = R.drawable.one;
        id[1] = R.drawable.two;
        id[2] = R.drawable.threee;
        ib.setImageResource(id[0]);
    }

    public void go(View view) {
        int x = (int) (Math.random() * 3 + 1);

        if (x == 1) {
            iv[0].setVisibility(view.VISIBLE);
            iv[1].setVisibility(view.INVISIBLE);
            iv[2].setVisibility(view.INVISIBLE);
            iv[0].setImageResource(id[0]);
        }
        if (x == 2) {
            iv[1].setVisibility(view.VISIBLE);
            iv[0].setVisibility(view.INVISIBLE);
            iv[2].setVisibility(view.INVISIBLE);
            iv[1].setImageResource(id[1]);
        }
        if (x == 3)  {
            iv[2].setVisibility(view.VISIBLE);
            iv[0].setVisibility(view.INVISIBLE);
            iv[1].setVisibility(view.INVISIBLE);
            iv[2].setImageResource(id[2]);

        }
    }
}
