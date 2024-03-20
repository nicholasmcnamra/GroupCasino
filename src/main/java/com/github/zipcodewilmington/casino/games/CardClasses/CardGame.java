package com.github.zipcodewilmington.casino.games.CardClasses;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.ArrayList;

public class CardGame implements GameInterface {
    ArrayList<PlayerInterface> humanPlayers;
    Dealer dealer;

    @Override
    public void add(PlayerInterface player) {
        humanPlayers.add(player);
    }

    @Override
    public void remove(PlayerInterface player) {
        humanPlayers.remove(player);
    }

    public String printRules(){

        return null;
    }

    @Override
    public void run() {

    }
}
