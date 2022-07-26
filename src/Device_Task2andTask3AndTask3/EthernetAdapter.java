package Device_Task2andTask3AndTask3;

public class EthernetAdapter {

    private int speed;
    private String mac;


    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public String toString() {
        return String.valueOf("Має Ethernet port зі швидкістю " + speed + " та мережеву карту з мак адресою " + mac);
    }
}
