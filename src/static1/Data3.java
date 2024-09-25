package static1;

public class Data3 {
    public String name; // 인스턴스 변수
    public static int count; // 클래스변수, 정적변수

    public Data3(String name) {
        this.name = name;
        count++;
    }

}
