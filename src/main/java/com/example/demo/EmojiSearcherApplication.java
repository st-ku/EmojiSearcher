package com.example.demo;

import com.example.demo.telegram.Bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class EmojiSearcherApplication {
    @Autowired
    Bot bot;
    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication.run(EmojiSearcherApplication.class, args);

    }



}
