package Practise;

public class Television {
    private boolean power;
    private int channel= 1; //default value
    private int volume = 1; //default volume

    public Television(boolean power, int channel, int volume) {

        this.power = power;
        this.channel = channel;
        this.volume = volume;

    }

    public Television() {

    }

    public void setPower(boolean setOn){
        if (setOn == true){
            power = true;
        }
    }

    public void setPowerOff(boolean setOff){
        if (setOff = false){
            power = false;
        }
    }

    public void setChannel(int channel){
        if (power == true && channel >= 1 || channel <= 120) {
            this.channel = channel;
        }
    }

    public void increaseChannel(int channel){
        if(power == true && channel < 120)
            channel++;

    }
    public void setDecreaseChannel(){
        if(power == true && channel > 1){
            channel--;
        }
    }

    public void setVolume(int volume){
        if ( power == true && volume >=1 || volume <= 7)
            this.volume = volume;
    }

    public void setIncreaseVolume(int volume){
        if(power == true && volume <= 7)
            volume++;

    }

    public void setDecreaseVolume(int volume){
        if (power == true && volume <= 7)
            volume--;

    }

    public boolean getPower(){
        return power;
    }
    public int getChannel(){
        return  channel;

    }

    public int getVolume(){
        return volume;
    }

}
