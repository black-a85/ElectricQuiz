package com.fourdt.electricquiz;

public class TextQuestion extends Question {
    private String answer;

    public TextQuestion(String question, String answer) {
        super(question);
        this.answer = answer;
    }


    public String getAnswer() {
        return answer;
    }
}
