package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.Accounts.CasinoAccount;
import com.github.zipcodewilmington.casino.PlayerInterface;


/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer implements PlayerInterface {

    private String accountName;

    private String accountPassword;
    private double accountBalance;
    SlotsGame slotsGame = new SlotsGame();
    public  SlotsPlayer() {

    }

    public SlotsPlayer(String accountName, String accountPassword, double accountBalance) {
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.accountBalance = accountBalance;

    }


    Casino casino = new Casino();
    @Override
    public CasinoAccount getArcadeAccount() {
        return casino.getCurrentPlayerAccount();
    }

    @Override
    public String play() {
        slotsGame.run();
        return "Thanks for playing.";
    }
}