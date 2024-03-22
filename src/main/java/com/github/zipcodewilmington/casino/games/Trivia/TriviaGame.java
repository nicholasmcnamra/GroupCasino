package com.github.zipcodewilmington.casino.games.Trivia;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.HashMap;
import java.util.Map;

public class TriviaGame implements GameInterface {

    String printRules = "Welcome to Random Trivia try your luck to see if you can get them all right! ";

    IOConsole io = new IOConsole();
    Questions questionsInstance = new Questions();

    public TriviaGame() {
    }

    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {

    }
    public String getRules(){
        return printRules;
    }
    public void runGame(){
        System.out.println(getRules() + "\n");

        questionsInstance.addQuestions();
        HashMap<Integer, String> questions = questionsInstance.questions;

        int index = 0 ;
        for(Map.Entry<Integer,String> questionvalues : questions.entrySet()){
            Integer key = questionvalues.getKey();
            String question = questionvalues.getValue();


            System.out.println("Question " + key + ": " + question + "\n");

            String playerAnswer = io.getStringInput("Answer:");
            if(playerAnswer.equalsIgnoreCase(questionsInstance.answerArray[index])){
                index++;
            }

        }
        System.out.printf("You answered %d out of 5 correctly", index);
//        for(String question: questions.values()){
//            System.out.println(question);
//        }


    }
}
