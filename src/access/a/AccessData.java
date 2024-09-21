package access.a;

public class AccessData {
    public int publicField;
    int defaultFeild;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출:" + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultField 호출:" + defaultFeild);
    }

    void privateMethod() {
        System.out.println("privateMethod 호출:" + privateField);
    }

    public void innerAccess() {
        System.out.println("내부호출");
        publicField = 100;
        defaultFeild = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();

    }

}
