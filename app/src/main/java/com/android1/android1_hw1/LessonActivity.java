package com.android1.android1_hw1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class LessonActivity extends AppCompatActivity {
//    AppCompatActivity - совместимая со старыми устройствами

    private TextView textView;
    private ImageView imageView;
    private Button button;
    private EditText editText;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_activity);
        initViews();
        setNetText();
        changeTextColor();
        setHeartImageToImageView();
        setOnBtnClickListener();
        setCheckBoxBehavior();
    }

    private void initViews() {
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.edit_text);
        checkBox = findViewById(R.id.checkBox);
    }

    private void setNetText() {
        String appNameStr = getString(R.string.lesson_app_name); // <- как взять значение а не ссылку
        textView.setText(R.string.new_text);
    }

    private void changeTextColor() {
        int colorRes = R.color.teal_700;
        int color = ContextCompat.getColor(getApplicationContext(), colorRes);
        textView.setTextColor(color);
    }

    private void setHeartImageToImageView() {
        //  int imageRes = R.drawable.ic_baseline_favorite_border_24;
        // drawable - обращение ко всем картинкам
        //  Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), imageRes);

        // Try & Catch - если не м.б текущего исправления ошибки (но стараться всегда исправлять)
//        try {
//            Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), imageRes);
////        } catch (NullPointerException exp) {
//        } catch (NullPointerException ignored) {
//            // что нужно сделать в случае указанной ошибки
//        }

        imageView.setImageResource(R.drawable.ic_baseline_favorite_border_24);
    }

    private void setOnBtnClickListener() {
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        // Сократим до лямбда-выражения:
        button.setOnClickListener(v -> {
//            textView.setText(R.string.lesson_app_name);
            String string = editText.getText().toString();
            textView.setText(string);
        });
    }

    private void setCheckBoxBehavior() {
        boolean isChecked = checkBox.isChecked();
        checkBox.setOnCheckedChangeListener((buttonView, isChecked1) -> {
            //чего-то делаем (если CheckBox поменялся)
        });
    }
}

/*
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/
