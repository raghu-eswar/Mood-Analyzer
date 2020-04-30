package com.mood.analyzer_test;

import com.mood.analyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void sadMoodTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("iam in sad mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void happyMoodTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("iam in any mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
