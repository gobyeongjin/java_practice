package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.openDoor();

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.openDoor();
        electricCar.charge();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.openDoor();
        hydrogenCar.fillHydrogen();

    }

}
