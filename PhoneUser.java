package PraktikumPhone;

public class PhoneUser {

    private Phone hape;

    public PhoneUser(Phone phone) {
        this.hape = phone;
    }
    
    void turnOnThePhone(){
        this.hape.powerOn();
    }
    
    void turnOffThePhone(){
        this.hape.powerOff();
    }
    
    void makePhoneLouder(){
        this.hape.volumeUp();
    }
    
    void makePhoneSilent(){
        this.hape.volumeDown();
    }
}
