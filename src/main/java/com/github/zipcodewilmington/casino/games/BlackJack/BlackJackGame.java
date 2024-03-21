package com.github.zipcodewilmington.casino.games.BlackJack;

import com.github.zipcodewilmington.casino.games.CardClasses.CardGame;

public class BlackJackGame extends CardGame {

    /*
    Rules
        The deck is 52 cards.
        There are no jokers.
        The Jack/Queen/King all count as 10.
        The Ace can count as 11 or 1.
        The cards in the deck have equal probability of being drawn.
        Cards are removed from the deck as they are drawn.
        The computer is the dealer.
     */

    /*
    Steps:
        Print the rules
        Gets users and their wager amounts
        Have the dealer deal every player 2 cards to start
        During a player's turn
            - Reveal every player's (including the dealer's) first card
            - Get if the user or deal has blackjack or busted
            - Count an ace as 11 until the user has > 21 at which point change the ace to a 1
            - Ask if they wish to hit
                - if not end the user's turn
        During a dealer's turn
            - Hit until hand total >= 16
            - Check for blackjack or bust
        Check winner
        Payout
        Ask if user wants to play again
     */

    @Override
    public String printRules(){

        return  "Goal: Get as close to 21 as possible without going over.\n" +
                "Betting: Before the round begins, each player places a bet using their chips.\n" +
                "Cards: The dealer gives each player one card face up, then themselves, then another face up," +
                " and finally takes their second card face down.\n" +
                "Values: Jacks, Queens, and Kings are worth 10, while Aces can be counted as 1 or 11." +
                " The remaining cards are worth face value.\n" +
                "Hand values: The player wins if their hand is higher than the dealer's without going bust." +
                " Going bust, or over 21, is an automatic loss.\n" +
                "Natural blackjack: If the player's first two cards total 21, they have a natural or blackjack.\n" +
                "Push: If the dealer's first two cards total 21, " +
                "the hand is a push and the player neither wins nor loses.";
    }

}

