package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNumber() {
        Radio radio = new Radio();

        radio.setCurrentNumber(5);

        int expected = 5;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void negativeStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setInvalidStation() {
        Radio radio = new Radio();

        radio.setCurrentNumber(15);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNext() {
        Radio radio = new Radio();

        radio.setCurrentNumber(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNext9() {
        Radio radio = new Radio();

        radio.setCurrentNumber(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrev() {
        Radio radio = new Radio();

        radio.setCurrentNumber(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrev9() {
        Radio radio = new Radio();

        radio.setCurrentNumber(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();


        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-8);


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundSwitchVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeFrom0() {
        Radio radio = new Radio();
        radio.increaseVolume();


        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeOver100() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void complexTest() {
        Radio radio = new Radio();
        radio.setCurrentNumber(6);
        radio.setCurrentVolume(50);
        radio.nextStation();
        radio.decreaseVolume();

        int expectedStation = 7;
        int expectedVolume = 49;


        int actualStation = radio.getCurrentNumber();
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedStation, actualStation);
        Assertions.assertEquals(expectedVolume, actualVolume);
    }

}

