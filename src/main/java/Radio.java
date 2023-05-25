public class Radio {
    private int currentNumberRadio;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int numberRadioCount) {
        maxStation = numberRadioCount - 1;
    }

    public void nextNumberRadio() {
        if (currentNumberRadio < maxStation) {
            currentNumberRadio++;
        } else
            currentNumberRadio = 0;
    }

    public void prevNumberRadio() {
        if (currentNumberRadio > 0) {
            currentNumberRadio--;
        } else
            currentNumberRadio = maxStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentNumberRadio() {
        return currentNumberRadio;
    }

    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio < 0) {
            return;
        }
        if (currentNumberRadio > maxStation) {
            return;
        }
        this.currentNumberRadio = currentNumberRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
