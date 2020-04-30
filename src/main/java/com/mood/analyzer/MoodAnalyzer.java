package com.mood.analyzer;

public class MoodAnalyzer {

    private String mood;
    enum MoodExceptionType {
        NULL,
        EMPTY
    }
    public MoodAnalyzer(String mood) {
        this.mood = mood;
    }

    public String analyseMood() throws MoodAnalysisException {
        if (this.mood == null) {throw new MoodAnalysisException(MoodExceptionType.NULL);}
        else if (this.mood.isEmpty()){ throw new MoodAnalysisException(MoodExceptionType.EMPTY);}
        else if (this.mood.contains("sad")) {return "SAD";}
        else if (this.mood.contains("any")) {return "HAPPY";}
        return null;
    }
}