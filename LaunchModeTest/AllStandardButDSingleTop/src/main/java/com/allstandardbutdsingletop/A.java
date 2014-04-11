package com.allstandardbutdsingletop;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class A extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);
    }

    public void onBClick(View v) {
        startActivity(new Intent(this, B.class));
    }
}
