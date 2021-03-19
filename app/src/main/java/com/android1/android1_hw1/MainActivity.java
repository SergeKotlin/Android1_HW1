package com.android1.android1_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button button;
    private Switch aSwitch;
    private CheckBox checkBox1;
    private CheckBox checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.main_activity);

        initViews();
        setOnBtnClickListener();

    }

    private void initViews() {
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.choosingSeconded);
        button = findViewById(R.id.button);
        aSwitch = findViewById(R.id.switchOfSeconded);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
    }

    private void setOnBtnClickListener() {
        button.setOnClickListener(v -> {
            String string = editText.getText().toString();
            textView.append(" " + string + ", ");

            setVisibleElements();
        });
    }

    private void setVisibleElements() {
        aSwitch.setVisibility(View.VISIBLE);
        aSwitch.setChecked(true);
        checkBox1.setVisibility(View.VISIBLE);
        checkBox2.setVisibility(View.VISIBLE);
    }
}

/* ✓ 1. Создать проект со следующими пользовательскими элементами: TextView, EditText, Button,
        Switch, CheckBox, ToggleButton.
 ✓ Для работы использовать LinearLayout.
 ✓ Использовать различные шрифты, цвета, размеры, прочие атрибуты.
2. Создать ещё один макет (если не получается, то проект) с несколькими EditText,
где использовать атрибут inputType: text, textPersonName, phone, number, textPassword,
textEmailAddress и другие значения.
3. Добавить в проект элемент CalendarView.
4. * Разобраться, что такое параметр ems.
* */
// Serega, sure