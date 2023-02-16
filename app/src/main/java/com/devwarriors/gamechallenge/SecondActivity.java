package com.devwarriors.gamechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.devwarriors.gamechallenge.databinding.ActivitySecondBinding;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    ActivitySecondBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b=ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        Intent intent=getIntent();
        int i=intent.getIntExtra("value",0);
        int j= (int)(Math.random()*(2-0+1));
        if(i==0)
        {
            b.user.setBackgroundResource(R.drawable.rock);
        }
        else if(i==1)
        {
            b.user.setBackgroundResource(R.drawable.paper);
        }
        else
        {
            b.user.setBackgroundResource(R.drawable.scissor);
        }

        if(j==0)
        {
            b.computer.setBackgroundResource(R.drawable.rock);

        }
        else if(j==1)
        {
            b.computer.setBackgroundResource(R.drawable.paper);
        }
        else
        {
            b.computer.setBackgroundResource(R.drawable.scissor);
        }

        if(i==0)
        {
            if(j==0)
            {
                b.result.setText("Its a Tie");
            }
            if(j==1)
            {
                b.result.setText("Computer Won");
            }
            if(j==2)
            {
                b.result.setText("You Won");
            }
        }
        if(i==1)
        {
            if(j==0)
            {
                b.result.setText("You Won");
            }
            if(j==1)
            {
                b.result.setText("Its a Tie");
            }
            if(j==2)
            {
                b.result.setText("Computer Won");
            }
        }
        if(i==2)
        {
            if(j==0)
            {
                b.result.setText("Computer Won");
            }
            if(j==1)
            {
                b.result.setText("You Won");
            }
            if(j==2)
            {
                b.result.setText("Its a Tie");
            }
        }

        b.play.setOnClickListener(view -> {
            Intent intent1=new Intent(SecondActivity.this,MainActivity.class);
            startActivity(intent1);
        });
    }
}