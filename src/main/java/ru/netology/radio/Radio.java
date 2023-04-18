package ru.netology.radio;
public class Radio {
    public int radioStations;
    public int volume;
    public int nextStation(int currentStation) {
        if (currentStation <= 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }

        return currentStation;
    }

    public int prevStation(int currentStation) {
        if (currentStation <= 9) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 0;

        }
        if (currentStation < 0) {
            currentStation = 9;
        }

        return currentStation;
    }

    public void setRadioStations(int newRadioStations) {
        if (newRadioStations <= 0){
            return;
        }
        if (newRadioStations > 9){
            return;
        }
        radioStations = newRadioStations;
    }

    public int increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int lowerTheVolume(int currentVolume) {
        if (currentVolume <= 100) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 100;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        return currentVolume;
    }
    public void setVolume(int newVolume) {
        if (newVolume <= 0){
            return;
        }
        if (newVolume > 100){
            return;
        }
        volume = newVolume;
    }
}