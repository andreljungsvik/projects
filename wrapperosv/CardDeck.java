import java.util.*;

public class CardDeck {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();

        for(Card.Suit suit : Card.Suit.values()) {
            for (int value = 1; value <= 13; value++) {
                deck.add(new Card(suit, value));
            }
        }
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}
