package com.mood.analyzer;

public class MoodAnalyzer {

    public String analyseMood(String mood) {
        if (mood.contains("sad")) {return "SAD";}
        else if (mood.contains("any")) {return "HAPPY";}
        return null;
    }
}