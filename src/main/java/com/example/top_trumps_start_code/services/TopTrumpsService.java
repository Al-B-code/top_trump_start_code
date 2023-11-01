package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Reply;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpsService {
    private ArrayList<Card> cardDeck;

    public static Reply checkWinner(Card card1, Card card2){
        Rank card1Rank = card1.getRank();
        Rank card2Rank = card2.getRank();
        String winner = "placeHolder";
        Reply reply;
        if (card1Rank.ordinal() > card2Rank.ordinal()){
             winner = (String.format("%S of %S wins!", card1.getRank(), card1.getSuit()));
    } else if (card2Rank.ordinal() > card1Rank.ordinal()) {
             winner =  (card2.getRank().name() + " of " + card2.getSuit().name() + " wins! ");
        }
        reply = new Reply(winner);
        return reply;
        }
    }
