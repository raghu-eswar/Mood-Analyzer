package com.mood.analyzer;

public class MoodAnalyzer {

    private String mood;
    public MoodAnalyzer(String mood) {
        this.mood = mood;
    }

    public String analyseMood() {
        if (this.mood.contains("sad")) {return "SAD";}
        else if (this.mood.contains("any")) {return "HAPPY";}
        return null;
    }
}