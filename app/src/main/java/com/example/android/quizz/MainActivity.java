package com.example.android.quizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.android.quizz.R.id.CheckBox1;

/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/
public class MainActivity extends AppCompatActivity {

    float questions = 8;
    float correct = 0;
    int answer;
    int correctId;
    int checkboxQ=0;
    float score;
    String toastMessage;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
            }
            public void onCheckBoxClicked (View view) {

                boolean checked = ((CheckBox) view).isChecked();
                switch (view.getId()) {
                    case R.id.CheckBox1:
                        if (checked) {
                            checkboxQ=1;

                        }

                }
            }

            public void checkAnswers(View view) {

                RadioGroup radioGroup1 = (RadioGroup)(findViewById(R.id.q1));
                answer = radioGroup1.getCheckedRadioButtonId();
                RadioButton radioButton1 = (RadioButton) findViewById(R.id.q1c);
                correctId = radioButton1.getId();
                if(answer == correctId){
                    correct = correct + 1;
                }

        RadioGroup radioGroup2 = (RadioGroup)(findViewById(R.id.q2));
        answer = radioGroup2.getCheckedRadioButtonId();
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.q2c);
        correctId = radioButton2.getId();
        if(answer == correctId){
            correct = correct + 1;
        }

        RadioGroup radioGroup3 = (RadioGroup)(findViewById(R.id.q3));
        answer = radioGroup3.getCheckedRadioButtonId();
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.q3b);
        correctId = radioButton3.getId();
        if(answer == correctId){
            correct = correct + 1;
        }

        RadioGroup radioGroup4 = (RadioGroup)(findViewById(R.id.q4));
        answer = radioGroup4.getCheckedRadioButtonId();
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.q4b);
        correctId = radioButton4.getId();
        if(answer == correctId){
            correct = correct + 1;
        }

        RadioGroup radioGroup5 = (RadioGroup)(findViewById(R.id.q5));
        answer = radioGroup5.getCheckedRadioButtonId();
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.q5b);
        correctId = radioButton5.getId();
        if(answer == correctId){
            correct = correct + 1;
        }
        RadioGroup radioGroup6 = (RadioGroup)(findViewById(R.id.q6));
        answer = radioGroup6.getCheckedRadioButtonId();
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.q6c);
        correctId = radioButton6.getId();
        if(answer == correctId){
            correct = correct + 1;
        }


        score = ((correct+ checkboxQ) / questions)*100;

        toastMessage = "Your score is " + score + "%!";

        Toast toast = Toast.makeText(getApplicationContext(),toastMessage,Toast.LENGTH_LONG);
        toast.show();

        //Reset form
        correct = 0;
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup6.clearCheck();




    }


}
