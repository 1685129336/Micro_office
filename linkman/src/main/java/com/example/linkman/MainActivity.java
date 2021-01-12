package com.example.linkman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.bawei.usercenter.R;

public class MainActivity extends AppCompatActivity {
    private LinkManFragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = new LinkManFragment();

        FragmentManager supportFragmentManager = getSupportFragmentManager();

        supportFragmentManager.beginTransaction().replace(R.id.frame,fragment).commit();

    }
}