package exercise1;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        Card[] hand = new Card[7];
        for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1; 
            String suit = Card.SUITS[random.nextInt(Card.SUITS.length)]; // Random suit
            hand[i] = new Card(suit, value);
        }

        
        System.out.println("Enter a card value (1-13): ");
        int userValue = input.nextInt();

        input.nextLine(); 

        System.out.println("Enter a suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = input.nextLine();

        
        boolean guessed = false;
        for (Card card : hand) {
            if (card.getValue() == userValue && card.getSuit().equals(userSuit)) {
                guessed = true;
                break;
            }
        }

        if (guessed) {
            printInfo();
        } else {
            System.out.println("Wrong guess");
        }
    }

    private static void printInfo() {
        // i am done
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Jaisman Singh Sidhu, but you can call me prof, Jerry or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Sleeping");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}