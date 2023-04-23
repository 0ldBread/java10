package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(9, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetOffRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldOffRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-3);
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetAboveNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.nextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        Assertions.assertEquals(29, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetUnderPrevRadioStation() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(12);
        radio.prevRadioStation();
        Assertions.assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        Assertions.assertEquals(10, radio.getCurrentVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetOffVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldOffVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(45);
        radio.increaseVolume();
        Assertions.assertEquals(46, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetAboveIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(102);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(67);
        radio.decreaseVolume();
        Assertions.assertEquals(66, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetUnderDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}

