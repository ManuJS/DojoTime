package com.manu.projeto.dojotime;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Mauricio on 04-Feb-17.
 */

public class MainPresenter implements MainContract.Presenter {

    @Override
    public Toast sendToast(Context context) {
        return Toast.makeText(context, "Play", Toast.LENGTH_SHORT );
    }
}
