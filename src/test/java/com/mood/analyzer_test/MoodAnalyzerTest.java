package com.mood.analyzer_test;

import com.mood.analyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void sadMoodTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("iam in sad mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void happyMoodTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("iam in any mood");
        Assert.assertEquals("HAPPY", mood);
    }
}
