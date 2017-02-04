package com.manu.projeto.dojotime;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.manu.projeto.dojotime.databinding.LayoutTimerPrincipalBinding;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    LayoutTimerPrincipalBinding binding;
    Toast toastPlay;
    Toast toastPause;
    Toast toastStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.layout_timer_principal);

        binding.editTime.setText("4:29");

        

        binding.imageButtonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastPlay.show();
            }
        });

    }

    @Override
    public void startTimer() {

    }


}
