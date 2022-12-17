package com.daniel.wordit;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ChronometerPro extends AppCompatActivity {
    Chronometer timer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        timer.setBase(SystemClock.elapsedRealtime());
        timer.start();
    }
}
