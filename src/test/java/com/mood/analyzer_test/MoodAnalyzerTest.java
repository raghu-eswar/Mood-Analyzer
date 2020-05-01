package com.mood.analyzer_test;

import com.mood.analyzer.MoodAnalyzerReflector;
import com.mood.analyzer.MoodAnalysisException;
import com.mood.analyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(MoodAnalysisException.class);
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void happyMoodTestWithEmpty() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(MoodAnalysisException.class);
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void moodAnalyzerObjectCreationTest() throws Exception {
        MoodAnalyzer moodAnalyzer = MoodAnalyzerReflector.getMoodAnalyzer("com.mood.analyzer.MoodAnalyzer", null);
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("iam in sad mood");
        boolean isEqual = moodAnalyzer.equals(moodAnalyzer1);
        Assert.assertEquals(false, isEqual);
    }

    @Test
    public void invokeAnalyseMoodWithNullByReflection() {
        try {
            MoodAnalyzerReflector.invokeAnalyseMood("com.mood.analyzer.MoodAnalyzer", null);
        } catch (Exception e) {
            Assert.assertEquals(MoodAnalysisException.class, e.getCause().getClass());
        }
    }

    @Test
    public void invokeAnalyseMoodWithEmptyByReflection() {
        try {
            MoodAnalyzerReflector.invokeAnalyseMood("com.mood.analyzer.MoodAnalyzer", "");
        } catch (Exception e) {
            Assert.assertEquals(MoodAnalysisException.class, e.getCause().getClass());
        }
    }

    @Test
    public void invokeAnalyseMoodWithHappyByReflection() {
        try {
            String mood = MoodAnalyzerReflector.invokeAnalyseMood("com.mood.analyzer.MoodAnalyzer", "iam any");
            Assert.assertEquals("HAPPY", mood);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void invokeAnalyseMoodWithSadByReflection() {
        try {
            String mood = MoodAnalyzerReflector.invokeAnalyseMood("com.mood.analyzer.MoodAnalyzer", "iam sad");
            Assert.assertEquals("SAD", mood);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






