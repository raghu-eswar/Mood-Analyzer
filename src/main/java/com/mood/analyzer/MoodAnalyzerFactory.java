package com.mood.analyzer;

import java.lang.reflect.Constructor;

public class MoodAnalyzerFactory {

    public static MoodAnalyzer getMoodAnalyzer(String className, String parameter) throws Exception {
        Class moodAnalyzer = Class.forName(className);
        Constructor constructor = moodAnalyzer.getConstructor(String.class);
        return (MoodAnalyzer) constructor.newInstance(parameter);
    }
}
