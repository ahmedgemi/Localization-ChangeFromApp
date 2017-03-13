package com.example.ahmed.localization_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    RadioButton radio_eng , radio_ar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio_eng = (RadioButton) findViewById(R.id.radioButton);
        radio_ar = (RadioButton) findViewById(R.id.radioButton2);




        radio_eng.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){

                    String lang = "en"; // your language
                    Locale myLocale = new Locale(lang);
                    Locale.setDefault(myLocale);
                    android.content.res.Configuration config = new android.content.res.Configuration();
                    config.locale = myLocale;
                    getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());


                    startActivity(new Intent(MainActivity.this,MainActivity.class));
                    finish();

                }
            }
        });

        radio_ar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){

                    String lang = "ar"; // your language
                    Locale myLocale = new Locale(lang);
                    Locale.setDefault(myLocale);
                    android.content.res.Configuration config = new android.content.res.Configuration();
                    config.locale = myLocale;
                    getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());


                    startActivity(new Intent(MainActivity.this,MainActivity.class));
                    finish();

                }
            }
        });
    }
}
