package com.brilliance.biit.universityassistantfree;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user-1 on 04-Oct-16.
 */

public class EditText_textView extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        TextView txt = (TextView)findViewById(R.id.txtActivity);
        Bundle bundle;
        bundle = getIntent().getExtras();
        txt.setText(bundle.getString("key"));
        //Intent i = getIntent();
        //String strt = i.getStringExtra("key");
        //txt.setText(strt);
        //txt.setText(i.getStringExtra("key"));
    }
}