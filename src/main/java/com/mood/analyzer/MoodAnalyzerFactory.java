package com.mood.analyzer;

import java.lang.reflect.Constructor;

public class MoodAnalyzerFactory {

    public static MoodAnalyzer getMoodAnalyzer(String className) throws Exception {
        Class moodAnalyzer = Class.forName(className);
        Constructor constructor = moodAnalyzer.getConstructor();
        return (MoodAnalyzer) constructor.newInstance();
    }
}
