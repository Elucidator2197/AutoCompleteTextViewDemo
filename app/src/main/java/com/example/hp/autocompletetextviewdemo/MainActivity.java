package com.example.hp.autocompletetextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actv;
    String languages[]={"C","C++","Java","JavaScript","VB","VB Script","HTML","XML","Cobol"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv=(AutoCompleteTextView)findViewById(R.id.actv);
        ArrayAdapter a1=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,languages);
        actv.setAdapter(a1);

    }
}
