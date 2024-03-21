package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.Accounts.CasinoAccount;


/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer {

    private String accountName;

    private String accountPassword;
    private double accountBalance;
    public  SlotsPlayer() {

    }

    public SlotsPlayer(String accountName, String accountPassword, double accountBalance) {
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.accountBalance = accountBalance;

    }



}