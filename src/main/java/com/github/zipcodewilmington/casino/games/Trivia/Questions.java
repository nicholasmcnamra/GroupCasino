package com.github.zipcodewilmington.casino.games.Trivia;

import java.util.HashMap;

public class Questions {
    private String answer1 = "Blue";
    private String answer2 = "Green";
    private String answer3 = "Java";
    HashMap<String, String> questions = new HashMap<String, String>();

    public Questions() {
    }

    public void addQuestion() {
        questions.put("one","What color is the sky? ");
        questions.put("two","What color is grass? ");
        questions.put("three","What computer language is 10.0 learning? ");
    }

    public java.util.Collection<String> getQuestion() {
        return null;
//        return questions.containsKey("one");
    }
}
