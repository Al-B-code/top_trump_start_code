package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Reply;
import com.example.top_trumps_start_code.services.TopTrumpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/toptrumps")
public class TopTrumpsController {


    @Autowired
    TopTrumpsService topTrumpsService;



    @PostMapping(value = "/create")
    public ResponseEntity<Reply> startNewGame(){
        Reply reply = topTrumpsService.startNewGame();
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Reply> winner(@RequestBody ArrayList<Card> cards){

        ArrayList<Card> listOfCards = new ArrayList<>();
        listOfCards = cards;
        Card card1 = listOfCards.get(0);
        Card card2 = listOfCards.get(1);

        Reply reply = topTrumpsService.checkWinner(card1, card2);
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }




}
