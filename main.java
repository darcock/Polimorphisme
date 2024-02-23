package PraktikumPhone;

public class main {
    public static void main(String[] args) {
        Xiaomi RedmiNote12Prow = new Xiaomi();
        PhoneUser sulthan = new PhoneUser(RedmiNote12Prow);

        sulthan.turnOnThePhone();
        sulthan.makePhoneLouder();
        sulthan.makePhoneLouder();
        sulthan.makePhoneSilent();
        sulthan.turnOffThePhone();
    }
}
