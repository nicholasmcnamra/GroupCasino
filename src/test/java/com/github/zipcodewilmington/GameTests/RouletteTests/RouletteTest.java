package com.github.zipcodewilmington.GameTests.RouletteTests;

import com.github.zipcodewilmington.casino.games.RandomNumber;
import com.github.zipcodewilmington.casino.games.Roulette.RouletteGame;
import org.junit.Assert;
import org.junit.Test;

public class RouletteTest {
    @Test
    public void testPrintRules() {
        RouletteGame roulette = new RouletteGame();
        String expectedRules = "Welcome to Roulette! Adapted for the non-gambling community, see if you can guess what number the ball will stop on.";

        String actualRules = roulette.getRules();

        Assert.assertEquals(expectedRules, actualRules);
    }
    ]

}
