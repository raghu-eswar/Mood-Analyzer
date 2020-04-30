package com.mood.analyzer;

public class MoodAnalyzer {

    private String mood;
    public MoodAnalyzer(String mood) {
        this.mood = mood;
    }

    public String analyseMood() {
        try {
            if (this.mood.contains("sad")) {return "SAD";}
            else if (this.mood.contains("any")) {return "HAPPY";}
        }catch (NullPointerException e) {
            return "HAPPY";
        }
        return null;
    }
}