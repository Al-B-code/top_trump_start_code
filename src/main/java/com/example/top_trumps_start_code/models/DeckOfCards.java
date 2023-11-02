package com.example.top_trumps_start_code.models;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class DeckOfCards {

    private ArrayList<Card> deck;

    @Autowired
    public DeckOfCards(){
        deck = createDeck();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    private ArrayList<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<>();

        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                Card card = new Card(rank, suit);
                deck.add(card);
                System.out.println(card.getRank().toString() + card.getSuit().toString());
            }
        }
        return deck;
    }

    public boolean containsCard(Card cardToFind) {
        for (Card card : deck) {
            if (card.equals(cardToFind)) {
                System.out.println(card.getRank().toString() + card.getSuit().toString());
                return true;
            }
        }
        return false;
    }

    public void removeCard(Card cardToRemove) {
        for (Card card : deck) {
            if (card.equals(cardToRemove)) {
                deck.remove(card);
                return;
            }
        }
    }
}

