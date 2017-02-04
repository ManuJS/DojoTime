package com.manu.projeto.dojotime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    TextView txtTempo;
    ImageButton play;
    ImageButton pause;
    ImageButton stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_timer_principal);

        txtTempo = (TextView) findViewById(R.id.editTime);
        play = (ImageButton) findViewById(R.id.imageButtonPlay);
        pause = (ImageButton) findViewById(R.id.imageButtonPause);
        stop = (ImageButton) findViewById(R.id.imageButtonStop);

        contatempo();
    }

    public void contatempo(){}
}
