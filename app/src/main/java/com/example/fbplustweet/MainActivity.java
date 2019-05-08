package com.example.fbplustweet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dofb(View view) {
        Intent intent=new Intent(MainActivity.this,FacebookActivity.class);
        startActivity(intent);
    }

    public void dotweet(View view) {
        Intent intent=new Intent(MainActivity.this,TweetActivity.class);
        startActivity(intent);
    }
}
