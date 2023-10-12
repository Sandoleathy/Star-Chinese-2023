package com.android.starchinese2023;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ActionBar bar = getSupportActionBar();
        //hide the default tool bar
        if(bar != null){
            bar.hide();
        }

        Button start_button = findViewById(R.id.start_button);
        Button load_button = findViewById(R.id.load_button);
        Button ending_button = findViewById(R.id.view_ending_button);
        start_button.setOnClickListener(this);
        load_button.setOnClickListener(this);
        ending_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.start_button){
            Toast.makeText(this,"Start click",Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.load_button){
            Intent toLoad = new Intent(this, LoadGame.class);
            //toLoad.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(toLoad);
        }
        else if(view.getId() == R.id.view_ending_button){
            Intent toView = new Intent(this, Endings.class);
            startActivity(toView);
            //Toast.makeText(this,"view ending click",Toast.LENGTH_SHORT).show();
        }
    }
}