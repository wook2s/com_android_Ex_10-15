package com.example.asb_ex_10_15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("돌아가시오");

        Intent intent = getIntent();
        final int num3 = intent.getIntExtra("num1",0) + intent.getIntExtra("num2", 0);

        Button btnReturn = (Button) findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outIntent = new Intent(SecondActivity.this, MainActivity.class);
                outIntent.putExtra("num3", num3);
                setResult(RESULT_OK, outIntent);
                finish();
            }
        });
    }
}
