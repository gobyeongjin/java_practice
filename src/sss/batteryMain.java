package sss;

public class batteryMain {

    public void main(String[] args) {
        battery battery1 = new battery(80);
        for (int i = 0; i < 50; i++) {
            battery1.usebattery();
        }
    }
}
