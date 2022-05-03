package com.company;

import java.util.ArrayList;

public class Question {

    private String question;
    private String correctAnswer;
    private ArrayList<String> answerOptions;
    private Integer pointValue;
    private Boolean correct;

    public Question (String question, String correctAnswer, Integer pointValue) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;
    }

    public String askQuestion (){
        return "I asked.";
    }

    // take user answer

    public String gradeQuestion(){
        return "I graded your question.";
    }
    // grade question
    // based on user answer changes correct property to true/false

    // answer options
    // point value

    // what is your favorite color?
    // a: blue, b: green, c: red, d: purple
    // blue, green, red, purple

    // ask question
}
