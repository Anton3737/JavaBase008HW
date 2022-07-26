package Device_Task2andTask3AndTask3;

public class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;


    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


    @Override
    public String toString() {
        return String.valueOf("Виробник " + manufacturer + " за ціною " + price + " серійний номер " + serialNumber );
    }

    public static void main(String[] args) {
        Device device = new Device(" Apple ", 1999, " 111AA33 ");
        Monitor monitor = new Monitor(1300, 900);
        EthernetAdapter ethernetAdapter = new EthernetAdapter(300, " mac333a7 ");

        System.out.println(device.getClass());
        System.out.println(monitor.getClass());
        System.out.println(ethernetAdapter.getClass());

        System.out.println();

        System.out.println(device);
        System.out.println(monitor);
        System.out.println(ethernetAdapter);

        System.out.println();

        System.out.println(device.hashCode());
        System.out.println(monitor.hashCode());
        System.out.println(ethernetAdapter.hashCode());

        System.out.println();

        System.out.println(device.equals(device));
        System.out.println(monitor.equals(ethernetAdapter));
        System.out.println(ethernetAdapter.equals(device));
    }


}
