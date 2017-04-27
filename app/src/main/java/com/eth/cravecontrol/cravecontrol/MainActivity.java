package com.eth.cravecontrol.cravecontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

import com.eth.cravecontrol.cravecontrol.TypeOfFood.TypeOfFood_greasy;
import com.eth.cravecontrol.cravecontrol.TypeOfFood.TypeOfFood_other;
import com.eth.cravecontrol.cravecontrol.TypeOfFood.TypeOfFood_salty;
import com.eth.cravecontrol.cravecontrol.TypeOfFood.TypeOfFood_sour;
import com.eth.cravecontrol.cravecontrol.TypeOfFood.TypeOfFood_sweet;


public class MainActivity extends AppCompatActivity {
    private static final int PROGRESS = 0x1;
    private ProgressBar userLvl;
    private int progressStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userLvl = (ProgressBar) findViewById(R.id.progressBar);

        userLvl.setProgress(progressStatus);
    }

    public void taste_sweet(View view) {
        Intent intent = new Intent(MainActivity.this, TypeOfFood_sweet.class);
        startActivity(intent);
    }

    public void taste_salty(View view) {
        Intent intent = new Intent(MainActivity.this, TypeOfFood_salty.class);
        startActivity(intent);
    }
    public void taste_sour(View view) {
        Intent intent = new Intent(MainActivity.this, TypeOfFood_sour.class);
        startActivity(intent);
    }
    public void taste_greasy(View view) {
        Intent intent = new Intent(MainActivity.this, TypeOfFood_greasy.class);
        startActivity(intent);
    }

    public void taste_other(View view) {
        Intent intent = new Intent(MainActivity.this, TypeOfFood_other.class);
        startActivity(intent);
    }

    public int getProgressStatus() {
        return progressStatus;
    }

    public void setProgressStatus(int progressStatus) {
        this.progressStatus = progressStatus;
    }
}
