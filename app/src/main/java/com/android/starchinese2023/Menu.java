package com.android.starchinese2023;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ActionBar bar = getSupportActionBar();
        //hide the default tool bar
        if(bar != null){
            bar.hide();
        }
    }
}