package com.example.demo.repository;

import com.example.demo.model.EmojiMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmojiRepository extends JpaRepository <EmojiMap, Integer> {

    EmojiMap findEmojiMapById(Integer id);
}
