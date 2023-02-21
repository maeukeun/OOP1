public class Radio {
    private int currentNumberRadio;
    private int currentVolume;

    public void nextNumberRadio(){
        if (currentNumberRadio < 9){
            currentNumberRadio ++;
        }
        else
            currentNumberRadio = 0;
    }

    public void prevNumberRadio(){
        if (currentNumberRadio > 0){
            currentNumberRadio --;
        }
        else
            currentNumberRadio = 9;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume ++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume --;
        }
    }
    public int getCurrentNumberRadio() {
        return currentNumberRadio;
    }

    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio < 0){
            return;
        }
        if (currentNumberRadio > 9){
            return;
        }
        this.currentNumberRadio = currentNumberRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0){
            return;
        }
        if (currentVolume > 10){
            return;
        }
        this.currentVolume = currentVolume;
    }
}
