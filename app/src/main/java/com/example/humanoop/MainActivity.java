package com.example.humanoop;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Human irene = new Human("irene", 20, 56);
//        irene.eat();
//        irene.spleep();
//        irene.sleep(9)
//        irene.bithday();
//        irene.speak("my name" );
//        Log.d("Human","irene's age"+irene.getAge(),)
        Anna one = new Anna("Anna", 78, 45, 34);
        one.eat();
        Log.d("Human", "Anna'weight is " + one.getWeight());
        one.bithday();
        Log.d("Anna", "your age is " + one.getAge());
//


    }
}


