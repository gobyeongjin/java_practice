package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member1 = new Member("myid", "고병진");
        member1.changeData("myid", "고병진진");
        member1.print();

    }
}
