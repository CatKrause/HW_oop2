package ru.netology.statistic;

public class Radio {
    private int maxNumber = 9;
    private int minNumber = 0;
    private int maxVolume = 100;

    private int minVolume = 0;

    private int currentNumber = minNumber;
    private int currentVolume = minVolume;
    public Radio() {

    }
    public Radio(int countStation) {

    }


    public int getMinNumber() {
        return minNumber;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMaxNumber() {
        return maxNumber;
    }


    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < minNumber) {
            return;
        }
        if (currentNumber > maxNumber) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minNumber) {
            return;
        }

        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void nextStation() {
        if (currentNumber < maxNumber) {
            currentNumber++;
        } else {
            currentNumber = minNumber;
        }
    }

    public void prevStation() {
        if (currentNumber > minNumber) {
            currentNumber--;
        } else {
            currentNumber = maxNumber;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;

        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}

