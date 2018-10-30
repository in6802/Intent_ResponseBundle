package com.cji.edu.intent_responsebundle;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextSingleName, editTextBundleName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);
    }

    @Override
    public void onClick(View v) {
       // super.finish();
    }

    @Override
    public void finish() {

        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("singleName", ((EditText)findViewById(R.id.editTextSingle)).getText().toString());
        bundle.putString("bundleName", ((EditText)findViewById(R.id.editTextBundle)).getText().toString());
        bundle.putString("resultValue", ((EditText)findViewById(R.id.editTextResult)).getText().toString());
        intent.putExtras(bundle);
        setResult(Activity.RESULT_FIRST_USER, intent);


        super.finish();
    }
}
