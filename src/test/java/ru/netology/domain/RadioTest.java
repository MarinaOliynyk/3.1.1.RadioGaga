package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio gaga = new Radio();

    @Test
    void shouldNextStationIfFinalStation() {
        gaga.setCurrentRadioStation(9);
        gaga.nextRadioStation();
        assertEquals(0, gaga.getCurrentRadioStation());
    }

    @Test
    void shouldNextRadioStation() {
        gaga.setCurrentRadioStation(2);
        gaga.nextRadioStation();
        assertEquals(3, gaga.getCurrentRadioStation());
    }

    @Test
    void shouldPrevStationIfStartStation() {
        gaga.setCurrentRadioStation(0);
        gaga.prevRadioStation();
        assertEquals(9, gaga.getCurrentRadioStation());
    }

    @Test
    void shouldPrevRadioStation() {
        gaga.setCurrentRadioStation(3);
        gaga.prevRadioStation();
        assertEquals(2, gaga.getCurrentRadioStation());
    }

    @Test
    void shouldControlNumButtonStation() {
        gaga.setCurrentRadioStation(5);
        assertEquals(5, gaga.getCurrentRadioStation());
    }

    @Test
    void shouldSoundVolumeUp() {
        gaga.setCurrentSoundVolume(9);
        gaga.shouldSoundVolumeUp();
        assertEquals(10, gaga.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDown() {
        gaga.setCurrentSoundVolume(7);
        gaga.shouldSoundVolumeDown();
        assertEquals(6, gaga.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeUpControl() {
        gaga.setCurrentSoundVolume(10);
        gaga.shouldSoundVolumeUp();
        assertEquals(10, gaga.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDownControl() {
        gaga.setCurrentSoundVolume(0);
        gaga.shouldSoundVolumeDown();
        assertEquals(0, gaga.getCurrentSoundVolume());
    }
}

