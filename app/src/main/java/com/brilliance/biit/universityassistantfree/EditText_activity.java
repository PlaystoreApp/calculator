package com.brilliance.biit.universityassistantfree;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user-1 on 04-Oct-16.
 */

public class EditText_activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        final EditText editText = (EditText)findViewById(R.id.edit);
      //  final String strTxt = editText.getText().toString();
        Button button = (Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),EditText_textView.class);
                intent.putExtra("key",editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
