package com.github.zipcodewilmington.casino.games.CardClasses;

import java.util.Arrays;
import java.util.List;

public class Dealer {

    public Deck deck;

    public Hand hand;

    public Dealer(){
        this.deck = new Deck();
        this.hand = new Hand();
    }

    public Cards.Card[] deal(int numCards){
        Cards.Card[] cards = new Cards.Card[numCards];
        for(int i = 0; i < numCards; i++){
            cards[i] = deck.pop();
        }
        return cards;
    }

    public void addToHand(Cards.Card... cards) {
        this.hand.addAll(Arrays.asList(cards));
    }

    public Hand getHand() {
        return hand;
    }

    public String printDealerHand(){
        String output = "Dealer's Hand: ";

        int index = 1;
        for(Cards.Card card : hand){
            if(index != hand.size()) {
                output += card.getCardValue() + " of " + card.getSuit() + ", ";
            }
            else{
                output += card.getCardValue() + " of " + card.getSuit();
            }
            index += 1;
        }
        return output;
    }

}
