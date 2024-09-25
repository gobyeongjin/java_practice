package static2.ex;

public class MathArrayUtils {
    // private 인스턴스 생성을 맊는다.
    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;

    }

    public static int min(int[] values) {
        int minvalue = values[0];

        for (int value : values) {
            if (minvalue > value) {
                minvalue = value;
            }
        }
        return minvalue;
    }

    public static int max(int[] values) {
        int maxvalue = values[0];

        for (int value : values) {
            if (maxvalue < value) {
                maxvalue = value;
            }
        }
        return maxvalue;
    }

}
