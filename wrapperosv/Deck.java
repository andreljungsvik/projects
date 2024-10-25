import java.util.*;

public class Deck {
    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (int value = 1; value <= 13; value++) {
                deck.add(new Card(suit, value));
            }
        }
        Collections.shuffle(deck);
    }
    public Card nextCard() {
        if(deck.isEmpty()) {
            return null;
        }
        return deck.remove(deck.size() - 1);
    }

    public boolean isEmpty() {
        return deck.isEmpty();
    }
}
