package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void hanafi(View view){
        Intent Anew = new Intent(this, hanafi.class);
        startActivity(Anew);
    }

    public void maliki(View view) {
        Intent Anew = new Intent(this,maliki.class);
        startActivity(Anew);
    }

    public void safie(View view) {
        Intent Anew = new Intent(this,safie.class);
        startActivity(Anew);
    }
    public void hamidi(View view) {
        Intent Anew = new Intent(this,hamidi.class);
        startActivity(Anew);
}
}