package com.android1.android1_hw1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

//    private EditText name;
    private EditText returnHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2_activity);

        initViews();
        removeHits();

    }

    private void initViews() {
//        name = findViewById(R.id.name);
        returnHello = findViewById(R.id.returnHello);
    }

    private void removeHits() {
//        name.setOnFocusChangeListener((View v, boolean hasFocus) -> {
//            if (hasFocus){
//                name.setText("");
//            }
//        });
//        name.setOnClickListener(v -> {
//            name.setText("");
//        });
//        returnHello.setOnClickListener(v -> {
//            returnHello.setText("");
//        });
//  - на комиты 0 внимания. Прошлые изыскания, для себя, легче вспомнить.

        returnHello.setOnFocusChangeListener((View v, boolean hasFocus) -> {
            if (hasFocus){
                returnHello.setText("");
            }
        });

    }

}