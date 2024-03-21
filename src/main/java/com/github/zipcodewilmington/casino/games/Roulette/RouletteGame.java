package com.github.zipcodewilmington.casino.games.Roulette;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.RandomNumber;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.Scanner;

public class RouletteGame extends IOConsole implements GameInterface {
    private String printRules = "Welcome to Roulette! Adapted for the non-gambling community, see if you can guess what number the ball will stop on.";
    private int randomNumberResult;
    private int playerGuess;

    IOConsole io = new IOConsole();

    public RouletteGame() {
    }

    public String getRules() {
        return printRules;
    }
    @Override
    public void run() {
        while(true) {
            System.out.println("Lets Play!\n Where do you think the ball will land?\n Pick a number between 0 and 36. ");
            playerGuess = io.getLongInput();
            if(playerGuess == randomNumberResult){
                System.out.println("Are you psychic??! Way to go! You win!");
            } else if (playerGuess != randomNumberResult) {
                System.out.println("Sorry that's not correct, would you like to try again?");
            }else {

            }
        }

    }
    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }
}
