package com.example.xp.repostator;

import android.app.Fragment;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class Entrada_datos extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada_datos);

        Fragment fragmento = new Repostaje();
        FragmentTransaction cambio = getFragmentManager().beginTransaction();
        cambio.replace(R.id.marcoIni, fragmento);
        cambio.commit();

    }
}
