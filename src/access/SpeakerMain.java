package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker1 = new Speaker(90);
        speaker1.showVolume();

        speaker1.volumeUp();
        speaker1.volumeUp();
        speaker1.volumeUp();
        speaker1.volumeDown();
        speaker1.showVolume();

        System.out.println("volume 필드 직접 접근 수령");
        // speaker1.volume = 200; private 접근 오류
        speaker1.showVolume();
    }

}
