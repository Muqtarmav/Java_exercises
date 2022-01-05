package Practises;

import java.util.Scanner;

public class Deck_of_cards {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int [] cards = new int[52];
        String [] suit = {"spades", "kings", "queen", "hearts"};
        String [] rank = {"1", "2", "Ace", "3", "4"};

        for (int i = 0; i < cards.length; i++){
            cards[i] = i;
        }

        for ( int i = 0; i < cards.length;  i++){
            int index = (int) (Math.random() * cards.length);
            int temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }

//        for (int i = 0; i < 4; i ++){
//            String suit = suit[cards[i] / 13];
//            String rank = rank[cards[i] % 13];
//            System.out.println("card number" + cards[i] + ":" + rank + "of" + suit);
        }

    }

