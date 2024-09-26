package final1;

public class ConstantMain {
    public static void main(String[] args) {
        System.out.println("시스템 최대사용자 수" + Constant.MAX_USERS);

        int CurrentUserCount = 999;
        process(CurrentUserCount++);
        process(CurrentUserCount++);
        process(CurrentUserCount++);
    }

    private static void process(int CurrentUserCount) {
        System.out.println("참여자수:" + CurrentUserCount);
        if (CurrentUserCount > 1000) {
            System.out.println("대기자로 등록합니다");
        } else {
            System.out.println("게임에 참가합니다");
        }
    }
}
