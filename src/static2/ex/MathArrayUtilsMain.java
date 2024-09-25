package static2.ex;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = { 1, 2, 4, 5, 6, 7 };

        System.out.println("합:" + MathArrayUtils.sum(values));
        System.out.println("평균:" + MathArrayUtils.average(values));
        System.out.println("최소:" + MathArrayUtils.min(values));
        System.out.println("최대:" + MathArrayUtils.max(values));
    }
}
