package com.devwarriors.gamechallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.devwarriors.gamechallenge.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        b=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        b.game.setOnClickListener(view -> {
            b.stone.setVisibility(View.VISIBLE);
            b.scissor.setVisibility(View.VISIBLE);
            b.paper.setVisibility(View.VISIBLE);
            b.stone.setBackgroundResource(R.drawable.rock);
            b.scissor.setBackgroundResource(R.drawable.scissor);
            b.paper.setBackgroundResource(R.drawable.paper);
        });

        b.stone.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("value",0);
            startActivity(intent);
        });

        b.paper.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("value",1);
            startActivity(intent);
        });

        b.scissor.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("value",2);
            startActivity(intent);
        });
    }
}