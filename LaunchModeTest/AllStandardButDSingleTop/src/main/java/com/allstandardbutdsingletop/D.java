package com.allstandardbutdsingletop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class D extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d);
    }

    public void onTask2Click(View v) {
        startActivity(new Intent(this, X.class)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
    }
}
