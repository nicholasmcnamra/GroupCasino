package com.github.zipcodewilmington.casino.games.BlackJack;

import com.github.zipcodewilmington.casino.Accounts.CasinoAccount;
import com.github.zipcodewilmington.casino.games.CardClasses.CardGamePlayer;
import com.github.zipcodewilmington.casino.games.CardClasses.Cards;
import com.github.zipcodewilmington.casino.games.CardClasses.Hand;

public class BlackJackPlayer extends CardGamePlayer {
    Hand hand;
    double wager;
    public BlackJackPlayer(double wager){
        super(wager);
        wager = super.getWagerAmount();
        hand = super.getHand();
    }
    public BlackJackPlayer(double wager, Cards.Card... cards){
        super(wager, cards);

        this.wager = super.getWagerAmount();
        hand = super.getHand();
    }

    @Override
    public CasinoAccount getArcadeAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }



    // I hate this. It is not clean at all. However, project is due tonight and this is the only workaround I could find
    // in time. If a new way to do this is discovered I will fix it.
    public int getHandTotal(){
        int total = 0;

        for (Cards.Card card : hand) {
            switch(card.getCardValue()){
                case ACE:
                    total += 11;
                    break;
                case KING:
                case JACK:
                case QUEEN:
                case TEN:
                    total += 10;
                    break;
                case NINE:
                    total += 9;
                    break;
                case EIGHT:
                    total += 8;
                    break;
                case SEVEN:
                    total += 7;
                    break;
                case SIX:
                    total += 6;
                    break;
                case FIVE:
                    total += 5;
                    break;
                case FOUR:
                    total += 4;
                    break;
                case THREE:
                    total += 3;
                    break;
                case TWO:
                    total += 2;
                    break;
            }
            if(total > 21 && hand.checkIfContainsValue(Cards.CardValue.ACE)){
                total -= 21;
            }
        }
        return total;
    }


    /*
    Get hand total
    Check if hand contains an ace
    -If so subtract 10 from the total (switch the ace value from 11 to 1)
    Return value > 21
     */
//    public boolean isBusted() {
//
//        return true;
//    }
}
