package com.mood.analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class MoodAnalyzerReflector {

    public static MoodAnalyzer getMoodAnalyzer(String className, String parameter) throws Exception {
        Class moodAnalyzer = Class.forName(className);
        Constructor constructor = moodAnalyzer.getConstructor(String.class);
        return (MoodAnalyzer) constructor.newInstance(parameter);

    }

    public static String invokeAnalyseMood(String className, String parameter) throws Exception {
        Class moodAnalyzer = Class.forName(className);
        Constructor constructor = moodAnalyzer.getConstructor(String.class);
        MoodAnalyzer obj =  (MoodAnalyzer) constructor.newInstance(parameter);
        Method analyzeMood = moodAnalyzer.getDeclaredMethod("analyseMood", null);
        return (String) analyzeMood.invoke(obj,null);
    }
}
