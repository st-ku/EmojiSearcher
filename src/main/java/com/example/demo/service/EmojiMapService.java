package com.example.demo.service;

import com.example.demo.repository.EmojiRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class EmojiMapService {
    @Autowired
   private EmojiRepository emojiRepository;


    public Map<String,String> getEmojiMap() {
      return  emojiRepository.findEmojiMapById(0).getParams();
}
    public String findMatches(String s) {
s=StringUtils.lowerCase(s);
        for(Map.Entry<String,String> entry: getEmojiMap().entrySet()) {
            if (entry.getKey().contentEquals(s)) {
                return entry.getValue();
            }
            if (entry.getKey().contains(s)) {
                return entry.getValue();
            }



        }
      return "Not found :(";
    }
}
