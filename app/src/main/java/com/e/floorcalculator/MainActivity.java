package com.e.floorcalculator;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextInputEditText textInputWidth;
    TextInputEditText textInputLength;
    Button buttonResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputWidth = (TextInputEditText) findViewById(R.id.textInputWidth);
        textInputLength = (TextInputEditText) findViewById(R.id.textInputLength);
        buttonResult = (Button) findViewById(R.id.buttonResult);

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String width;
                String length;

                width = textInputWidth.getText().toString();
                length = textInputLength.getText().toString();

                Intent detailActIntent = new Intent(v.getContext(), ResultActivity.class);
                detailActIntent.putExtra("WIDTH", width);
                detailActIntent.putExtra("LENGTH", length);
                startActivity(detailActIntent);
            }
        });

    }
}
