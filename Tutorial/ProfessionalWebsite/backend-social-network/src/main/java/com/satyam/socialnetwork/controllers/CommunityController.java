package com.satyam.socialnetwork.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/community")
public class CommunityController {

    @GetMapping("/messages")
    public ResponseEntity<List<MessageDto>> getCommunityMessages() {

    }

    @GetMapping("/images")
    public void getCommunityImages(){

    }

    @PostMapping("/messages")
    public void postMessage(){

    }

    @PostMapping("/images")
    public void postImage(){

    }
}
