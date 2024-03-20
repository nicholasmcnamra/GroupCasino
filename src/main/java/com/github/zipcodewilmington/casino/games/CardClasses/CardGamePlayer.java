package com.github.zipcodewilmington.casino.games.CardClasses;

import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Stack;

public abstract class CardGamePlayer implements PlayerInterface {

    private Hand hand;
    double wagerAmount;



    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public double getWagerAmount() {
        return wagerAmount;
    }

    public void setWagerAmount(double wagerAmount) {
        this.wagerAmount = wagerAmount;
    }

    public int getHandTotal(){
        return 0;
    }

    public Stack<Cards.Card> drawCards(int numToDraw){

        return new Stack<>();
    }

    public void takeTurn(){}

}
