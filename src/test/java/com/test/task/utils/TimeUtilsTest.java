package com.test.task.utils;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by alex on 12/7/16.
 */
public class TimeUtilsTest {

    private TimeUtils timeUtils = new TimeUtils();

    @Test
    public void showCorrectGreetingMessageWhenLanguageIsEnglishAndTimeIsSixOclock() {
        assertTrue(timeUtils.showGreetingMessage(6, "en").equals("Good morning, World!"));
    }

    @Test
    public void showCorrectGreetingMessageWhenLanguageIsEnglishAndTimeIsElevenOclock() {
        assertTrue(timeUtils.showGreetingMessage(11, "en").equals("Good day, World!"));
    }

    @Test
    public void showCorrectGreetingMessageWhenLanguageIsEnglishAndTimeIsTwentyOneOclock() {
        assertTrue(timeUtils.showGreetingMessage(21, "en").equals("Good evening, World!"));
    }

    @Test
    public void showCorrectGreetingMessageWhenLanguageIsEnglishAndTimeIsTwentyThreeOclock() {
        assertTrue(timeUtils.showGreetingMessage(23, "en").equals("Good night, World!"));
    }

    @Test
    public void showCorrectGreetingMessageWhenLanguageIsRussionAndTimeIsSixOclock() {
        assertTrue(timeUtils.showGreetingMessage(6, "ru").equals("Доброе утро, Мир!"));
    }

    @Test
    public void showCorrectGreetingMessageWhenLanguageIsRussionAndTimeIsElevenOclock() {
        assertTrue(timeUtils.showGreetingMessage(11, "ru").equals("Добрый день, Мир!"));
    }

    @Test
    public void showCorrectGreetingMessageWhenLanguageIsRussionAndTimeIsTwentyOneOclock() {
        assertTrue(timeUtils.showGreetingMessage(21, "ru").equals("Добрый вечер, Мир!"));
    }

    @Test
    public void showCorrectGreetingMessageWhenLanguageIsRussionAndTimeIsTwentyThreeOclock() {
        assertTrue(timeUtils.showGreetingMessage(23, "ru").equals("Доброй ночи, Мир!"));
    }
    
    
}
