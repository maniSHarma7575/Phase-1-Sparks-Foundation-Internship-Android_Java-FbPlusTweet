package com.example.fbplustweet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubTweetActivity extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_tweet);
        String username=getIntent().getStringExtra("username");
        t1=(TextView)findViewById(R.id.uname);
        t1.setText(username);
    }
}
