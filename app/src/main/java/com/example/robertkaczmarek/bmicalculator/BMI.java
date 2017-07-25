package com.example.robertkaczmarek.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class BMI extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_bmi);

    }


    public void calculate(View view) {
        EditText weight = (EditText) findViewById(R.id.weight);
        String w = weight.getText().toString();
        boolean isError = false;
        if(TextUtils.isEmpty(w)){
            weight.setError(getString(R.string.warning));
            isError = true;
        }
      //  Double ww = Double.parseDouble(w);
        EditText height = (EditText)findViewById(R.id.height);
        String h = height.getText().toString();
        if(TextUtils.isEmpty(h)){
            height.setError(getString(R.string.warning1));
            isError = true;
        }

    if (!isError) {
        Intent go = new Intent(BMI.this, result1.class);
        go.putExtra(result1.WEIGHT, w);
        go.putExtra(result1.HEIGHT, h);

        startActivity(go);
    }
    }


    public void cleare(View view) {
        EditText weight = (EditText) findViewById(R.id.weight);

        EditText height = (EditText)findViewById(R.id.height);


        weight.setText("");
        height.setText("");

    }
}
