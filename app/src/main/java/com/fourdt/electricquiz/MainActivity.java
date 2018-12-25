package com.fourdt.electricquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Question> questions = new ArrayList<>();
    TextQuestion question1 = new TextQuestion(getResources().getString(R.string.question_1), getResources().getString(R.string.question_1_answer));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questions.add(question1);

        LinearLayout questionsLayout = findViewById(R.id.questions_layout);
        for(Question q:questions){
            int questionLayoutId = 0;
            if (q.getClass().isInstance(question1)){
                questionLayoutId = R.layout.text_question;
            }
            getLayoutInflater().inflate(questionLayoutId,questionsLayout);
        }

    }
}
