package com.irena.robertkaczmarek.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class History extends AppCompatActivity {

    protected static final String history = "history";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Intent take = getIntent();

        String w = take.getStringExtra(history);
        List<String> myList = new ArrayList<String>(Arrays.asList(w.split(";")));

        ListView his = (ListView) findViewById(R.id.history);
        ArrayAdapter<String> show = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myList);
        his.setAdapter(show);
    }
}
