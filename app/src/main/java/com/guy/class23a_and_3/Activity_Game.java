package com.guy.class23a_and_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Game extends AppCompatActivity {


    public interface CallBack_Timer {
        void tick();
    }


    private MyTicker myTicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        CallBack_Timer callBack_timer = new CallBack_Timer() {
            @Override
            public void tick() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        ticker();
                    }
                });
            }};
            myTicker = new MyTicker(callBack_timer);
    }

    @Override
    protected void onResume() {
        super.onResume();
        myTicker.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        myTicker.stop();
    }

    public void ticker() {

    }
}
