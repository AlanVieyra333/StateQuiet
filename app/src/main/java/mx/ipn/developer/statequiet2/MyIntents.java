package mx.ipn.developer.statequiet2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by developer on 6/09/17.
 */

public class MyIntents {
    public static Intent goMap(AppCompatActivity vm) {
        return new Intent(vm, MapsActivity.class);
    }
}
