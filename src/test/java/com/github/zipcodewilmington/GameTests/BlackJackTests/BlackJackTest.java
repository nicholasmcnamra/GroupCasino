package com.github.zipcodewilmington.GameTests.BlackJackTests;

import com.github.zipcodewilmington.casino.games.BlackJack.BlackJackGame;
import com.github.zipcodewilmington.casino.games.CardClasses.CardGame;
import org.junit.Assert;
import org.junit.Test;

public class BlackJackTest {
    @Test
    public void testInheritance(){
        BlackJackGame blackJackGame = new BlackJackGame();

        Assert.assertTrue(blackJackGame instanceof CardGame);
    }
}
