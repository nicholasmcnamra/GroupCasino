package com.github.zipcodewilmington.GameTests.BlackJackTests;

import com.github.zipcodewilmington.casino.games.BlackJack.BlackJackPlayer;
import com.github.zipcodewilmington.casino.games.CardClasses.CardGamePlayer;
import com.github.zipcodewilmington.casino.games.CardClasses.Cards;
import com.github.zipcodewilmington.casino.games.CardClasses.Hand;
import com.github.zipcodewilmington.casino.games.Trivia.Questions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//+ handleAce(): int
//+ hit(): returns Card
//+ isBusted(): bool
//+ has21(): bool
public class BlackJackPlayerTest {
    BlackJackPlayer player;
    @Before
    public void setup(){
        player = new BlackJackPlayer(0);
    }
    @Test
    public void testInheritance(){
        Assert.assertTrue(player instanceof CardGamePlayer);
    }

    @Test
    public void testGetHandTotal(){
        Cards.Card card1 = new Cards.Card(Cards.CardValue.TEN, Cards.Suit.CLUBS);
        Cards.Card card2 = new Cards.Card(Cards.CardValue.QUEEN, Cards.Suit.CLUBS);
        int expected = 20;

        player.addToHand(card1, card2);

        int actual = player.getHandTotal();

        Assert.assertEquals(expected, actual);

    }

}
