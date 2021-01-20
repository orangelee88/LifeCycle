package com.example.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    String TAG = "flow2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        Log.d( TAG, "onCreate" );


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

    public void click2(View view) {

        Toast.makeText( MainActivity2.this, "回主頁中", Toast.LENGTH_SHORT ).show();/**短暫提示消息*/
        Intent intent = new Intent();
        intent.setClass( MainActivity2.this, MainActivity.class );/**返回主頁*/
        startActivity( intent );

    }

}
