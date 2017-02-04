package com.manu.projeto.dojotime;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Mauricio on 04-Feb-17.
 */

public interface MainContract {

    public interface View {
        void startTimer();
    }

    public interface Presenter {
        Toast sendToast(Context context);
    }

}
