package com.github.zipcodewilmington.casino.games.Roulette;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.RandomNumber;

public class RouletteGame implements GameInterface {
    private String printRules = "Welcome to Roulette! Adapted for the non-gambling community, see if you can guess what number the ball will stop on.";

    public RouletteGame() {
    }


    public String getRules() {
        return printRules;
    }
    @Override
    public void run() {

    }
    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

}
