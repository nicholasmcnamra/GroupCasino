package com.github.zipcodewilmington.casino.games.Craps;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.Accounts.CasinoAccount;

public class CrapsPlayer {

    private String accountName;
    private String accountPassword;
    private double accountBalance;


    public CrapsPlayer(String accountName, String accountPassword, double accountBalance){
        this.accountName = accountName;
        this. accountPassword = accountPassword;
        this.accountBalance = accountBalance;
    }

    public CrapsPlayer(CasinoAccount currentPlayerAccount) {
    }

    public double getAccountBalance() {
        return accountBalance;
    }


}
