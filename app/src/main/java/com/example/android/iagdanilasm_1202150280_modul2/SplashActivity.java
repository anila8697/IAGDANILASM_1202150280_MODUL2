package com.example.android.iagdanilasm_1202150280_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.widget.Toast;

public class SplashActivity extends Activity {

    private final int SPLASH_DISPLAY_LENGTH = 5000;
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
                Toast.makeText(SplashActivity.this,"ANILA SUKMA_1202150280",Toast.LENGTH_LONG).show();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}