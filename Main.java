package com.josh;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String suit = GetSuit();
        int cardNumber = GetCardNumber();
        CheckCard(suit, cardNumber);

    }

    //
    //
    // METHODS //
    //
    //
    private static HashMap<String, Integer> CheckCard(String suitUsed, int cardNumberUsed) {
        HashMap<String, Integer> card = new HashMap<>();
        if (card.containsKey(suitUsed) && card.containsValue(cardNumberUsed)) {
            System.out.println("I will get another card");
        } else {
            card.put(suitUsed, cardNumberUsed);
            System.out.println(card);
        }
        return card;
    }


    // Get Card Number
    private static int GetCardNumber() {
        Random randNumber = new Random();
        int Number = randNumber.nextInt(13) + 1;
    return Number;
    }


    //Get Card Suit
    private static String GetSuit() {
        String[] cardSuitsList = new String[4];
        cardSuitsList[0] = "Diamonds";
        cardSuitsList[1] = "Clubs";
        cardSuitsList[2] = "Spades";
        cardSuitsList[3] = "Hearts";

        int randSuit = new Random().nextInt(cardSuitsList.length);
        String cardSuit = (cardSuitsList[randSuit]);
        return cardSuit;
    }
}
