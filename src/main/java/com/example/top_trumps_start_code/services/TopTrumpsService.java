package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Game;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Reply;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpsService {
    private Game game;


    public Reply startNewGame(){
        this.game = new Game(10);
        return new Reply("Started new game.");
    }

    public Reply checkWinner(Card card1, Card card2){
        Reply reply;
        String gameStatus;


        // checks if the card is in the deck/ has been removed before.
        if (!this.game.getDeckOfCards().containsCard(card1)){
            reply = new Reply("Card 1 has been previously removed");
            return reply;
        } else if (!this.game.getDeckOfCards().containsCard(card2)){
            reply = new Reply("Card 2 has been previously removed");
            return reply;
        }

        Rank card1Rank = card1.getRank();
        Rank card2Rank = card2.getRank();

        // checks the winner based on enum value of rank.
        if (card1Rank.ordinal() > card2Rank.ordinal()){
             gameStatus = (String.format("%S of %S wins!", card1.getRank(), card1.getSuit()));
        } else if (card2Rank.ordinal() > card1Rank.ordinal()) {
             gameStatus =  (card2.getRank().name() + " of " + card2.getSuit().name() + " wins! ");
        } else {
            gameStatus = "Draw!";
        }
        this.game.getDeckOfCards().removeCard(card1);
        this.game.getDeckOfCards().removeCard(card2);
        reply = new Reply(gameStatus);
        return reply;
        }
    }
