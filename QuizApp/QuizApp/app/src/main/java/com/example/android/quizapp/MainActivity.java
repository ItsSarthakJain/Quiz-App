    package com.example.android.quizapp;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.View;
    import android.widget.CheckBox;
    import android.widget.EditText;
    import android.widget.RadioButton;
    import android.widget.RadioGroup;
    import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
        int score=0;
        public void checkbox(View view)
        {
            CheckBox checkBox1=(CheckBox)findViewById(R.id.checkbox1);
            CheckBox checkBox2=(CheckBox)findViewById(R.id.checkbox2);
            CheckBox checkBox3=(CheckBox)findViewById(R.id.checkbox3);
            CheckBox checkBox4=(CheckBox)findViewById(R.id.checkbox4);
            boolean checked1 = checkBox1.isChecked();
            boolean checked2 = checkBox2.isChecked();
            boolean checked3 = checkBox3.isChecked();
            boolean checked4 = checkBox4.isChecked();
            if(checked1&&checked2&&!checked3&&checked4)
                score++;
        }
        public void check(View view)
        {
            CheckBox checkBox1=(CheckBox)findViewById(R.id.check1);
            CheckBox checkBox2=(CheckBox)findViewById(R.id.check2);
            CheckBox checkBox3=(CheckBox)findViewById(R.id.check3);
            CheckBox checkBox4=(CheckBox)findViewById(R.id.check4);
            boolean checked1 = checkBox1.isChecked();
            boolean checked2 = checkBox2.isChecked();
            boolean checked3 = checkBox3.isChecked();
            boolean checked4 = checkBox4.isChecked();
            if(checked1&&!checked2&&checked3&&!checked4)
                score++;
        }
       public void radioclick(View view)
       {
           RadioGroup radiogroup =  (RadioGroup) findViewById(R.id.radiogrp);
           int selectedId = radiogroup .getCheckedRadioButtonId();
           if(selectedId==R.id.radio1)
           score++;
       }
       public void submit(View view)
       {
           radioclick(view);
           checkbox(view);
           check(view);
           EditText a=(EditText)findViewById(R.id.anthem);
           if(a.getText().toString().equalsIgnoreCase("rabindranath tagore"))
               score++;
           EditText b=(EditText)findViewById(R.id.ans6);
           if(b.getText().toString().equalsIgnoreCase("oreo"))
               score++;
           EditText c=(EditText)findViewById(R.id.ans3);
           if(c.getText().toString().equalsIgnoreCase("narendra modi"))
               score++;
           Toast toast = Toast.makeText(getApplicationContext()," You Scored "+score+"/6 ",Toast.LENGTH_SHORT);
           toast.show();
           score=0;
       }
    }
