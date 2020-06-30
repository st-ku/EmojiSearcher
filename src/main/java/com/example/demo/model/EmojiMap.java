package com.example.demo.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class EmojiMap {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "emoji_List")
    @MapKeyColumn(name = "value")
    @Column(name = "key")
    private Map<String, String> params = new HashMap<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

}
