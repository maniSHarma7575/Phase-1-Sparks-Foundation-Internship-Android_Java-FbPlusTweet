package com.example.fbplustweet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class SubFacebookActivity extends AppCompatActivity {

    private CircleImageView circleImageView;
    private TextView txtName,txtEmail;
    String name="";
    String email="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_facebook);
        Intent intent=getIntent();
        Bundle extras=intent.getExtras();
        name=extras.getString("username");
        email=extras.getString("email");



        circleImageView=findViewById(R.id.profile_image);
        txtName=findViewById(R.id.profile_name);
        txtEmail=findViewById(R.id.profile_email);



        txtEmail.setText(email);
        txtName.setText(name);



    }
}
