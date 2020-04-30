package com.mood.analyzer;

public class MoodAnalysisException extends Throwable {
    public MoodAnalysisException(MoodAnalyzer.MoodExceptionType cause) {
        super(cause+" dose not a valid message");
    }
}
