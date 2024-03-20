package com.github.zipcodewilmington.GameTests.TriviaTests;

import com.github.zipcodewilmington.casino.games.Trivia.Questions;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionsTest {
    @Test
    public void testGetQuestion() {
        Questions questions = new Questions();
        String expectedQuestion = "1.What color is the sky? ";

        String actualQuestion = String.valueOf(questions.getQuestion());

        Assert.assertEquals(expectedQuestion,actualQuestion);
    }
}