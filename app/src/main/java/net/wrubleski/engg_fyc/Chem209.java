package net.wrubleski.engg_fyc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

public class Chem209 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem209);
    }

    public void periodicTable(View view){
        Intent intent = new Intent(this,PeriodicTable.class);
        startActivity(intent);
    }

    public void iceTableSolver(View view){
        Intent intent = new Intent(this,IceTableSolver.class);
        startActivity(intent);
    }
}
