package com.mood.analyzer;

public class MoodAnalysisException extends Throwable {
    public MoodAnalysisException(MoodAnalyzer.MoodExceptionType cause) {
        super(cause+" is not a valid message");
    }
}
