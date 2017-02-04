package com.manu.projeto.dojotime;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.manu.projeto.dojotime.databinding.LayoutTimerPrincipalBinding;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    LayoutTimerPrincipalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.layout_timer_principal);

        binding.imageButtonPause.

        contatempo();
    }

    public void contatempo(){}
}
