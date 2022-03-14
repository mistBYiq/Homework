package main.java.com.mistiq.homework.string.domain.composite;

import java.util.ArrayList;

public class LeafWord extends ArrayList implements Component {
    private Long id;
    private String word;

    public LeafWord(String word) {
        setWord(word);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id++;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }

    @Override
    public void show() {
        System.out.print(" " + getWord());
    }
}
