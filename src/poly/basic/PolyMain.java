package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent-> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child->child");
        Child child = new Child();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent->Child");
        Parent poly = new Child();
        poly.parentMethod();

        // Child child1 = new Parent(); 자식은 부모를 담을 수없다

        // 자식이 기능을 호출할수없다.
        // poly.childMethod();
    }

}
