package com.github.zipcodewilmington.GameTests.CardClassesTest;

import com.github.zipcodewilmington.casino.games.CardClasses.Cards;
import com.github.zipcodewilmington.casino.games.CardClasses.Deck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Stack;

public class DeckTests {
    private Deck deck;

    @Before
    public void setUp(){
        deck = new Deck();
    }
    @Test
    public void testInheritance(){
        Assert.assertTrue(deck instanceof Stack);
    }

    @Test
    public void testPop(){
        Cards.Card newCard = new Cards.Card(Cards.CardValue.QUEEN, Cards.Suit.HEARTS);
        deck.add(newCard);
        Cards.Card expected = newCard;

        Cards.Card actual = deck.pop();

        Assert.assertEquals(expected, actual);

    }
}
