package io.github.fatihbozik.ch1.objectmethods.hashcode.example1;

/**
 * @author Fatih Bozik
 */

class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
	if (rank == null || suit == null) {
	    throw new IllegalArgumentException();
	}
	this.rank = rank;
	this.suit = suit;
    }

    public boolean equals(Object obj) {
	if (!(obj instanceof Card)) {
	    return false;
	}
	Card other = (Card) obj;
	return rank.equals(other.rank) && suit.equals(other.suit);
    }

    public int hashCode() {
	return rank.hashCode();
    }
}
