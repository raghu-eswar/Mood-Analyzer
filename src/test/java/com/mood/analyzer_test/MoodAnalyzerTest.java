package com.mood.analyzer_test;

import com.mood.analyzer.MoodAnalysisException;
import com.mood.analyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void sadMoodTest() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("iam in sad mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void happyMoodTest() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("iam in any mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void happyMoodTestWithNull() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = null;
        try {
            mood = moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void happyMoodTestWithEmpty() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        String mood = null;
        try {
            mood = moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", mood);
    }
}
