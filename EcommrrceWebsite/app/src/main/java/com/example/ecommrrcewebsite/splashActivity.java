package com.example.ecommrrcewebsite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ////// status bar hide start ////////
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        }
        ////// status bar hide end ////////

        ///// add handler ///
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, 2000);
    }
}