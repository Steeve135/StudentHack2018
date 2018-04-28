package com.example.lucas.studenthackquiz;

public class QuestionLibrary {

    private String questions [] = {
            "",
            "",
            "",
    };

    private String choices [] [] = {
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
    };

    private String answers [] = {
            "",
            "",
            "",
    };

    private String getQuestion(int a){
        String currentQuestion = questions[a]
        return currentQuestion;
    }

    private String getChoice1(int a){
        String choice1 = choices[a][0];
        return choice1;
    }

    private String getChoice2(int a){
        String choice2 = choices[a][1];
        return choice2;
    }

    private String getChoice3(int a){
        String choice3 = choices[a][2];
        return choice3;
    }

    private String getAnswer(int a){
        String currentAnswer = answers[a];
        return currentAnswer;
    }
}
