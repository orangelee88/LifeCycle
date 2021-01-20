package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "flow";

    @SuppressLint("WifiManagerLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Log.d( TAG, "onCreate" );
        Button button = (Button) findViewById( R.id.btn1 ); // 取得按鈕物件

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d( TAG, "onPause" );
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d( TAG, "onRestart" );
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d( TAG, "onStart" );

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d( TAG, " onResume" );

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d( TAG, " onStop" );

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d( TAG, " onDestroy" );

    }


    public void click(View view) {/**按鈕點擊事件*/
        Toast.makeText( MainActivity.this, "跳頁中", Toast.LENGTH_SHORT ).show();/**短暫提示消息*/
        Intent intent = new Intent( MainActivity.this, MainActivity2.class );/**next*/
        startActivity( intent );//啟動意圖

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        /** 修改手機返回預設銷毀方式*/
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            moveTaskToBack(false);
//            return true;
//        }
        return super.onKeyDown( keyCode, event );
    }

}