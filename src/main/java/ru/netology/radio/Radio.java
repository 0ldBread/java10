package ru.netology.radio;

public class Radio {
    private int minRadioStations = 0;
    private int maxRadioStations = 9;
    private int currentRadioStation = minRadioStations;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int size) {
        maxRadioStations = minRadioStations + (size - 1);

    }

    public Radio() {
        currentRadioStation = maxRadioStations;
        currentVolume = maxVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStations;
    }

    public int getMinRadioStation() {
        return minRadioStations;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStations) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        currentRadioStation = currentRadioStation >= maxRadioStations ? 0 : ++currentRadioStation;
        setCurrentRadioStation(currentRadioStation);
    }

    public void prevRadioStation() {
        currentRadioStation = currentRadioStation <= 0 ? maxRadioStations : --currentRadioStation;
        setCurrentRadioStation(currentRadioStation);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        currentVolume = currentVolume >= maxVolume ? maxVolume : ++currentVolume;
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        currentVolume = currentVolume >= maxVolume ? 0 : --currentVolume;
        setCurrentVolume(currentVolume);
    }
}