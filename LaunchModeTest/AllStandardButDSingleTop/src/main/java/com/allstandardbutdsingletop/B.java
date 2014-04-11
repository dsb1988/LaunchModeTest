package com.allstandardbutdsingletop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class B extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b);
    }

    public void onCClick(View v) {
        startActivity(new Intent(this, C.class));
    }
}
