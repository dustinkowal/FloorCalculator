package com.e.floorcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewResult = (TextView) findViewById(R.id.textViewResult);

        Bundle extras = getIntent().getExtras();
        String width = extras.getString("WIDTH");
        String length = extras.getString("LENGTH");

        String result;
        Double flooringNeeded = Double.parseDouble(width) * Double.parseDouble(length);

        result = "Width is " + width + " and Length is " + length + " and floowing needed is " + flooringNeeded;

        textViewResult.setText(result);
    }
}
