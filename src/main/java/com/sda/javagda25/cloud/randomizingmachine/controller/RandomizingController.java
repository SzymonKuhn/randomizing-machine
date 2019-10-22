package com.sda.javagda25.cloud.randomizingmachine.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomizingController {
    @Value("${random.words")
    private String[] words;

    @Value("${random.numbers")
    private String[] numbers;


    @GetMapping("/word")
    public String randomWord() {
        return getOne(words);
    }



    @GetMapping("/number")
    public String randomNumber() {
        return getOne(numbers);
    }


    private String getOne(String[] array) {
        int count = array.length;
        Random random = new Random();
        int num = random.nextInt(count);
        return array[num];
    }



}
