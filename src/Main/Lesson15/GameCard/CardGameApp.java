package Main.Lesson15.GameCard;


import java.util.List;

class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();


        deck.shuffle();


        List<Card> hand = deck.deal(6);
        System.out.println("Dealt hand: " + hand);


        System.out.println("Remaining cards in deck: " + deck);
    }
}
