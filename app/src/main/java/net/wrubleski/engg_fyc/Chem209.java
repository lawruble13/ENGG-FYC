package net.wrubleski.engg_fyc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
