
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream()
                .forEach(cards -> System.out.print(cards + "\n"));
    }

    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        Collections.sort(this.hand, comparator);
    }

    @Override
    public int compareTo(Hand o) {
        int valueThisHand = 0;
        int valueOtherHand = 0;

        for (Card thisHand : this.hand) {
            valueThisHand += thisHand.getValue();
        }

        for (Card otherHand : o.hand) {
            valueOtherHand += otherHand.getValue();
        }

        return valueThisHand - valueOtherHand;

    }

    public void sortBySuit() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);

        Collections.sort(this.hand, comparator);
    }
}
