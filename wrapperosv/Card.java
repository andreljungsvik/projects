
public class Card {
    public enum Suit {
        HEARTS, SPADES, DIAMONDS, CLUBS;

        @Override
        public String toString() {
            switch (this) {
                case HEARTS:
                    return "Hjärter";
                case SPADES:
                    return "Spader";
                case DIAMONDS:
                    return "Ruter";
                case CLUBS:
                    return "Klöver";
                default:
                    return null;
            }
        }
    }

    private Suit suit;
    private int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        String valueString;
        switch (value) {
            case 1:
                valueString = "Ess";
                break;
            case 11:
                valueString = "Knäckt";
                break;
            case 12: 
                valueString = "Dam";
                break;
            case 13:
                valueString = "Kung";
                break;       
            default:
                valueString = String.valueOf(value);
        }
        return valueString + " av " + suit;
    }
}
