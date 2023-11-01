package com.example.top_trumps_start_code.models;

import java.util.ArrayList;

public class Game {


    private DeckOfCards deckOfCards; //Will create a deck of cards object.
    private int rounds;
    private boolean complete;

    public Game(int rounds) {
        this.deckOfCards = new DeckOfCards();
        this.rounds = rounds;
        this.complete = false;
    }

    public Game() {
    }

    public DeckOfCards getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(DeckOfCards deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
