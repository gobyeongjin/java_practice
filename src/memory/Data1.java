package memory;

public class Data1 {
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        // 인스턴스에서 사용되는 멤버변수 COUNT값은
        // 인스턴스끼리 공유 되지 않는다.
        count++;
    }
}
