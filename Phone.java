package PraktikumPhone;

public interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void volumeUp();
    void volumeDown();
    void powerOff();
    
}