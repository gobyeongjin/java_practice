package static2.ex;

public class Car {
    private static int totalCars;
    private String name;

    public Car(String name) {
        System.out.println("구입차량:" + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("총 차량개수:" + totalCars);
    }

}
