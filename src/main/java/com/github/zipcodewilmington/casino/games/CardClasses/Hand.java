package com.github.zipcodewilmington.casino.games.CardClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class Hand extends ArrayList<Cards.Card> {

    public Hand(){}
    public Hand(Cards.Card... cards){
        this.addAll(Arrays.asList(cards));
    }
}
