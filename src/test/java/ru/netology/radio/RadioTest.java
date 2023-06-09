package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test

    public void next() {
        Radio station = new Radio();
        station.setRadioStations(9);

        station.nextStation();

        int expected = 0;
        int actual = station.getRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void next1() {
        Radio station = new Radio();
        station.setRadioStations(0);

        station.nextStation();

        int expected = 1;
        int actual = station.getRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void next2() {
        Radio station = new Radio();
        station.setRadioStations(5);

        station.nextStation();

        int expected = 6;
        int actual = station.getRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void prev() {
        Radio station = new Radio();
        station.setRadioStations(0);

        station.prevStation();

        int expected = 9;
        int actual = station.getRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void prev1() {
        Radio station = new Radio();
        station.setRadioStations(6);

        station.prevStation();

        int expected = 5;
        int actual = station.getRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void prev2() {
        Radio station = new Radio();
        station.setRadioStations(9);

        station.prevStation();

        int expected = 8;
        int actual = station.getRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void turnOnTheStation1() {
        Radio station = new Radio();

        station.setRadioStations(9);

        int expected = 9;
        int actual = station.getRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void turnOnTheStation2() {
        Radio station = new Radio();

        station.setRadioStations(10);

        int expected = 0;
        int actual = station.getRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void turnOnTheStation3() {
        Radio station = new Radio();

        station.setRadioStations(-1);

        int expected = 0;
        int actual = station.getRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void upVolume() {
        Radio station = new Radio();
        station.setVolume(100);

        station.increaseVolume();

        int expected = 100;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void upVolume1() {
        Radio station = new Radio();
        station.setVolume(0);

        station.increaseVolume();

        int expected = 1;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void upVolume2() {
        Radio station = new Radio();
        station.setVolume(50);

        station.increaseVolume();

        int expected = 51;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void downVolume() {
        Radio station = new Radio();
        station.setVolume(100);

        station.lowerTheVolume();

        int expected = 99;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void downVolume1() {
        Radio station = new Radio();
        station.setVolume(0);

        station.lowerTheVolume();

        int expected = 0;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void downVolume2() {
        Radio station = new Radio();
        station.setVolume(50);

        station.lowerTheVolume();

        int expected = 49;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void downVolume3() {
        Radio station = new Radio();
        station.setVolume(101);

        station.lowerTheVolume();

        int expected = 0;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void setTheVolume() {
        Radio station = new Radio();

        station.setVolume(100);

        int expected = 100;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void setTheVolume1() {
        Radio station = new Radio();

        station.setVolume(101);

        int expected = 0;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void setTheVolume2() {
        Radio station = new Radio();

        station.setVolume(-1);

        int expected = 0;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);

    }

}

