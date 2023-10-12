package com.android.starchinese2023;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class LoadGame extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load_game);

        ActionBar bar = getSupportActionBar();
        //hide the default tool bar
        if(bar != null){
            bar.hide();
        }

        Button backButton = findViewById(R.id.back_button);
        Button confirmButton = findViewById(R.id.confirm_button);
        backButton.setOnClickListener(this);
        confirmButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.back_button){
            Intent toMenu = new Intent(this, Menu.class);
            //make sure there is only one menu activity
            //toMenu.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(toMenu);
        }else if(v.getId() == R.id.confirm_button){
            Toast.makeText(this,"load game",Toast.LENGTH_SHORT).show();
        }
    }
}
