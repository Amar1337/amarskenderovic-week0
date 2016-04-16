package com.example.sick.amarskenderovic_week0;

import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    CheckBox checkBox8;
    CheckBox checkBox9;
    CheckBox checkBox10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox)findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox)findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox)findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox)findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox)findViewById(R.id.checkBox9);
        checkBox10 = (CheckBox)findViewById(R.id.checkBox10);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    findViewById(R.id.ears).setVisibility(View.VISIBLE);
                } else {
                    findViewById(R.id.ears).setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    findViewById(R.id.shoes).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.shoes).setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    findViewById(R.id.mustache).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.mustache).setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    findViewById(R.id.eyebrows).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.eyebrows).setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    findViewById(R.id.arms).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.arms).setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    findViewById(R.id.eyes).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.eyes).setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    findViewById(R.id.hat).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.hat).setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    findViewById(R.id.mouth).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.mouth).setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    findViewById(R.id.glasses).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.glasses).setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    findViewById(R.id.nose).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.nose).setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
