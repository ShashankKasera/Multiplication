package com.example.lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.mlib.Maths;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Maths.sum(2,55);
        Log.i("kjjnj", "onCreate: "+Maths.sum(2,55));
        Toast.makeText(this, Maths.sum(2,55)+"", Toast.LENGTH_LONG).show();
    }
}
