package com.github.zipcodewilmington.casino.games.CardClasses;

import com.github.zipcodewilmington.casino.games.CardClasses.Cards.Card;

import java.util.Stack;

public class Deck extends Stack<Card> {

    public Deck(){
        // Loop through each possible card value
        for(int i = 0; i < 13; i++){
            Cards.CardValue val = Cards.CardValue.values()[i];
            // Iterate through the suites
            for(int j = 0; j < 4; j++){
                // Creates card with value CardValue i and Suite j
                Card card = new Card(val, Cards.Suit.values()[j]);
                add(card);
            }
        }
    }
}
