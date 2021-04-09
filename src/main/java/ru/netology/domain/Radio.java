package ru.netology.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {

    private int startStation = 0;
    private int finalStation = 10;
    private int currentRadioStation;
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;


    public Radio(int currentRadioStation, int finalStation) {
        this.currentRadioStation = currentRadioStation;
        this.finalStation = finalStation;
    }

    public int nextRadioStation() {
        currentRadioStation = currentRadioStation >= finalStation ? startStation : ++currentRadioStation;
        return currentRadioStation;
    }

    public int prevRadioStation() {
        currentRadioStation = currentRadioStation <= startStation ? finalStation : --currentRadioStation;
        return currentRadioStation;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            this.currentSoundVolume = maxSoundVolume;
            return;
        }
        if (currentSoundVolume < minSoundVolume) {
            this.currentSoundVolume = minSoundVolume;
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void shouldSoundVolumeUp() {
        if (currentSoundVolume == maxSoundVolume)
            return;
        currentSoundVolume++;
    }

    public void shouldSoundVolumeDown() {
        if (currentSoundVolume == minSoundVolume)
            return;
        currentSoundVolume--;
    }
}
