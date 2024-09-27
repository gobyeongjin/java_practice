package extends1.ex;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar ecCar = new ElectricCar();
        ecCar.move();
        ecCar.charge();

        GasCar gcCar = new GasCar();
        gcCar.move();
        gcCar.fillup();
    }
}
