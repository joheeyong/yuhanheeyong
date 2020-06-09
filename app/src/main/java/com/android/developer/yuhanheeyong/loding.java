package com.android.developer.yuhanheeyong;

import android.content.Intent;
import android.nfc.cardemulation.HostNfcFService;
import android.os.Handler;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class loding  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_loding);
        setTitle ("로딩화면");

        startLoading ();
    }

    private void startLoading() {
        Handler handler = new Handler ();
        handler.postDelayed (new Runnable () {
            @Override
            public void run() {
                Intent intent = new Intent (getBaseContext (), start.class);
                startActivity (intent);
                finish ();
            }

        }, 2000);
    }
}
