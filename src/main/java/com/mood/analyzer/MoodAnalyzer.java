package com.mood.analyzer;

import java.util.Objects;

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
        if (this.mood == null) throw new MoodAnalysisException(MoodExceptionType.NULL);
        else if (this.mood.isEmpty()) throw new MoodAnalysisException(MoodExceptionType.EMPTY);
        else if (this.mood.contains("sad")) return "SAD";
        else if (this.mood.contains("any")) return "HAPPY";
        return null;
    }

    @Override
    public boolean equals(Object o) {
        MoodAnalyzer that = (MoodAnalyzer) o;
        if (this.mood == null || that.mood == null || getClass() != o.getClass()) return false;
        if (this.mood.equals(that.mood)) return true;
        return Objects.equals(mood, that.mood);
    }
}