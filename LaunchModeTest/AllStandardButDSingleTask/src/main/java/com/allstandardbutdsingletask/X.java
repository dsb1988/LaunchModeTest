package com.allstandardbutdsingletask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class X extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.x);
    }

    public void onYClick(View v) {
        startActivity(new Intent(this, Y.class));
    }
}
