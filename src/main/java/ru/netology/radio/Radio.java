package ru.netology.radio;

public class Radio {
    private int maxRadioStations = 9;
    private int radioStations;
    private int volume;

    public Radio(int maxRadioStations){
        this.maxRadioStations = maxRadioStations;

    }
    public Radio (){
        maxRadioStations = 9;
    }

    public int getRadioStations() {
        return radioStations;
    }

    public int getMaxRadioStations(){
        return maxRadioStations;
    }

    public int getVolume() {
        return volume;
    }


    public void setRadioStations(int newRadioStations) {
        if (newRadioStations <= 0) {
            return;
        }
        if (newRadioStations > maxRadioStations) {
            return;
        }
        radioStations = newRadioStations;
    }

    public void setVolume(int newVolume) {
        if (newVolume <= 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }


    public void nextStation() {
        radioStations = radioStations >= 9 ? 0 : ++radioStations;
    }

    public void prevStation() {
        radioStations = radioStations <= 0 ? 9 : --radioStations;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void lowerTheVolume() {
        if (volume > 0) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
    }
}