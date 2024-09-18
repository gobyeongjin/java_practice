package oop1;

public class ValueObjectMain {
    public static void main(String ars[]) {
        ValueObject valueobject = new ValueObject();
        valueobject.add();
        valueobject.add();
        valueobject.add();
        System.out.println("최종숫자:" + valueobject.value);
    }
}
