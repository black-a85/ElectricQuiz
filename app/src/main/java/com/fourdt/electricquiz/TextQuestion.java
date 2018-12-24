package com.fourdt.electricquiz;

public class TextQuestion {
    private String question;
    private String answer;

    public TextQuestion(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}