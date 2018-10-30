package com.cji.edu.intent_responsebundle;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button buttonExplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonExplicit = findViewById(R.id.buttonExplicit);
        buttonExplicit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent( this, ExplicitActivity.class);
        startActivityForResult(intent, Activity.RESULT_FIRST_USER);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data.hasExtra("singleName")) {
            String text = data.getStringExtra("singleName");
                         // + data.getStringExtra("BundleName")
                          // + data.getStringExtra("ResultValue");
            TextView textViewResult = findViewById(R.id.textViewResult);
            textViewResult.setText(text);
        }
    }
}
