package com.example.top_trumps_start_code.models;

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Card(){};


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // Objects are the same instance
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;  // Objects are of different classes or null
        }

        Card otherCard = (Card) obj;
        return this.suit == otherCard.suit && this.rank == otherCard.rank;
    }


    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getCardValue(){
        return this.rank.getValue();
    }
}
