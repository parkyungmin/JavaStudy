package basic.oop1;

public class MusicPlayer {
    int volumn = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플에이어를 시작합니다.");
    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumnUp() {
        volumn++;
        System.out.println("음악 플에이어 볼륨: " + volumn);
    }
    void volumnDown() {
        volumn--;
        System.out.println("음악 플에이어 볼륨: " + volumn);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");

        if (isOn) {
            System.out.println("음악 플레이어 On, 볼륨 : " + volumn);
        } else {
            System.out.println("음악 플레이어 Off, 볼륨 : " + volumn);
        }
    }
}
