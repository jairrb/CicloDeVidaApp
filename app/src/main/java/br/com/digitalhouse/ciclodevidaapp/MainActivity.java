package br.com.digitalhouse.ciclodevidaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.wtf("ALOG","OnCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ALOG", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ALOG", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ALOG", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ALOG", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ALOG", "onDestroy()");
    }
}
