package com.github.zipcodewilmington.GameTests.TriviaTests;

import com.github.zipcodewilmington.casino.games.Trivia.Questions;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


//-questionaire: Hash Map
//-questions: String
//-answer: String
//+getQuestion(); return String
//+getAnswer(); return String

public class QuestionsTest {
    @Test
    public void testGetQuestions() {
        Questions questions = new Questions();
        questions.addQuestions();
        String expectedQuestion = "What food never spoils? ";

        String actualQuestion = String.valueOf(questions.getQuestions());

        Assert.assertEquals(expectedQuestion,actualQuestion);
    }
    @Test
    public void testGetAnswers() {
        Questions questions = new Questions();
        String expectedAnswers = "Honey";

        String actualAnswers = questions.getAnswers();

        Assert.assertEquals(expectedAnswers,actualAnswers);
    }
}