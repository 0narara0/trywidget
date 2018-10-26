package com.cmy.www.trywidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, RadioGroup.OnCheckedChangeListener, View.OnKeyListener {

    Button btn1, btn2, btn3;
    EditText editText1, editText2;
    TextView textview;
    RadioGroup radioGroup1,radioGroup2;
    RadioButton rbtn1,rbtn2,rbtn3,rbtn4;
    String gender, job, name, age;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        editText1 = (EditText)findViewById(R.id.edittext1);
        editText1.setOnKeyListener(this);
        editText2 = (EditText)findViewById(R.id.edittext2);
        editText2.setOnKeyListener(this);
        textview = (TextView)findViewById(R.id.textviewresult);
        radioGroup1 =(RadioGroup)findViewById(R.id.radiogroupgender);
        radioGroup2 =(RadioGroup)findViewById(R.id.radiogroupjob);
        radioGroup1.setOnCheckedChangeListener(this);
        radioGroup2.setOnCheckedChangeListener(this);
        rbtn1 =(RadioButton)findViewById(R.id.rbtn1);
        rbtn2 =(RadioButton)findViewById(R.id.rbtn2);
        rbtn3 =(RadioButton)findViewById(R.id.rbtn3);
        rbtn4 =(RadioButton)findViewById(R.id.rbtn4);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.btn1:
                textview.setText(editText1.getText());
                break;
            case R.id.btn2:
                textview.setText(editText2.getText());
                break;
            case R.id.btn3:
                textview.setText("이름은 "+editText1.getText()+", 나이는 "+editText2.getText()
                        +", 성별은 "+gender+", 직업은 "+job+" 입니다.");
                break;
        }

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rbtn1:
                gender=rbtn1.getText().toString();
                break;
            case R.id.rbtn2:
                gender=rbtn2.getText().toString();
                break;
            case R.id.rbtn3:
                job=rbtn3.getText().toString();
                break;
            case R.id.rbtn4:
                job=rbtn4.getText().toString();
                break;
        }
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        switch (v.getId()){
            case R.id.edittext1:
                name=editText1.getText().toString();
                break;

            case R.id.edittext2:
                age=editText2.getText().toString();
                break;
        }
        return false;
    }
}
