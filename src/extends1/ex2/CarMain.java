package extends1.ex2;

import extends1.ex.GasCar;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar ecCar = new ElectricCar();
        ecCar.move();
        ecCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillup();

    }
}
