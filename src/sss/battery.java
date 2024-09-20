package sss;

public class battery {
    int percentage;

    battery(int percentage) {
        this.percentage = percentage;
    }

    void usebattery() {
        if (percentage <= 0) {
            System.out.println("배터리가 없습니다.");
        } else {
            percentage -= 1;
            System.out.println(percentage);
        }
    }

    void chargebattery() {
        if (percentage >= 100) {
            System.out.println("배터리 충전이 완료되었습니다.");
        } else {
            percentage += 1;
            System.out.println(percentage);
        }
    }

    void nowbattery() {
        System.out.println(percentage);
    }

}
