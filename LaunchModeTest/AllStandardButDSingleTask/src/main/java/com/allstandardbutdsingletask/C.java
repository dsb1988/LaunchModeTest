package com.allstandardbutdsingletask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class C extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c);
    }

    public void onDClick(View v) {
        startActivity(new Intent(this, D.class));
    }
}
