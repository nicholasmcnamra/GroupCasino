package com.github.zipcodewilmington.casino.games.Trivia;

import java.util.HashMap;

public class Questions {
    private String answer1 = "Honey";
    private String answer2 = "Antarctica";
    private String answer3 = "Java";
    private String answer4 = "Gangstagrass";
    private String answer5 = "Earth";
    HashMap<Integer, String> questions = new HashMap<Integer, String>();

    public Questions() {
    }

    public void addQuestions() {
        questions.put(1,"What food never spoils? ");
        questions.put(2,"What is the largest desert in the world? ");
        questions.put(3,"What computer language is 10.0 learning? ");
        questions.put(4,"What band does Dolio play in? ");
        questions.put(5,"What planet is called the blue planet? ");

    }

    public String getQuestions() {
        return null;
//        return questions.containsKey("one");
    }

    public String getAnswers() {
        return answer1;
    }
}
