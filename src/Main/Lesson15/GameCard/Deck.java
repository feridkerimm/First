package Main.Lesson15.GameCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> deal(int numberOfCards) {
        if (numberOfCards > cards.size()) {
            throw new IllegalArgumentException("Not enough cards in the deck to deal.");
        }
        List<Card> dealtCards = new ArrayList<>(cards.subList(0, numberOfCards));
        cards = new ArrayList<>(cards.subList(numberOfCards, cards.size()));
        return dealtCards;
    }

    @Override
    public String toString() {
        return "Deck of " + cards.size() + " cards";
    }
}