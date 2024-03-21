package com.github.zipcodewilmington.GameTests.BlackJackTests;

import com.github.zipcodewilmington.casino.games.BlackJack.BlackJackPlayer;
import com.github.zipcodewilmington.casino.games.CardClasses.CardGamePlayer;
import org.junit.Assert;
import org.junit.Test;

public class BlackJackPlayerTest {
    @Test
    public void testInheritance(){
        BlackJackPlayer blackJackPlayer = new BlackJackPlayer();

        Assert.assertTrue(blackJackPlayer instanceof CardGamePlayer);
    }
}
