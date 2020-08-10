package com.example.aboutme;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_expe;
    ProgressBar barra;
    int level = 15;
    String msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());

        tv_expe = findViewById(R.id.tv_expe);
        barra = findViewById(R.id.progressBar);
        barra.setProgress(level);

        if (level > 94) {
            msj="Expert";
        } else if (level > 84){
            msj = "Senior";
        } else if (level > 74){
            msj = "Advanced";
        } else if (level > 64){
            msj = "Proficient";
        } else if (level > 54){
            msj = "Skillfull";
        } else if (level > 44){
            msj = "Skilled";
        } else if (level > 34){
            msj = "Talented";
        } else if (level > 24){
            msj = "Beginner";
        } else if (level > 14){
            msj = "Rookie";
        } else{
            msj= "Newbie";
        }

        tv_expe.setText(msj);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //         .setAction("Action", null).show();
                Intent intent = new Intent(MainActivity.this,ContactActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

/*
Newbie
Novice
Rookie
Beginner
Talented
Skilled
Intermediate
Skillful
Seasoned
Proficient
Experienced
Advanced
Senior
Expert

Toast toast = Toast.makeText(this   , "HOLA!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 400, -750);
        toast.show();
 */