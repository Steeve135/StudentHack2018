package com.example.lucas.studenthackquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary possibleQuestions = new QuestionLibrary();

    private TextView scoreView;
    private TextView questionView;
    private Button firstChoice;
    private Button secondChoice;
    private Button thirdChoice;

    private String questionAnswer;
    private int score = 0;
    private int qNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        scoreView=(TextView)findViewById(R.id.score);
        questionView=(TextView)findViewById(R.id.question);
        firstChoice=(Button)findViewById(R.id.choice1);
        secondChoice=(Button)findViewById(R.id.choice2);
        thirdChoice=(Button)findViewById(R.id.choice3);

        updateQuestion();

        //Button listeners
        firstChoice.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                if(firstChoice.getText()==questionAnswer){
                    score = score++;
                    updateScore(score);
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });//choice1

        secondChoice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(secondChoice.getText()==questionAnswer){
                    score = score++;
                    updateScore(score);
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });//choice2

        thirdChoice.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if(thirdChoice.getText()==questionAnswer){
                    score = score++;
                    updateScore(score);
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });//choice3
    }

    private void updateQuestion(){
        questionView.setText(possibleQuestions.getQuestion(qNumber));
        firstChoice.setText(possibleQuestions.getChoice1(qNumber));
        secondChoice.setText(possibleQuestions.getChoice2(qNumber));
        thirdChoice.setText(possibleQuestions.getChoice3(qNumber));

        questionAnswer=possibleQuestions.getAnswer(qNumber);
        qNumber++;
    }

    private void updateScore(int point){
        scoreView.setText(score);
    }
}
