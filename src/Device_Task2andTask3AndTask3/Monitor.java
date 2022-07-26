package Device_Task2andTask3AndTask3;

public class Monitor {

    private int resolutionX;
    private int resolutionY;


    public Monitor(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString() {
        return String.valueOf("Монітор з діагональю " + resolutionX + " на  " + resolutionY + "px/'");
    }
}
