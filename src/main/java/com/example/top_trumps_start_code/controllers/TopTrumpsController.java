package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.services.TopTrumpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/toptrumps")
public class TopTrumpsController {


    @Autowired
    TopTrumpsService topTrumpsService;





}
