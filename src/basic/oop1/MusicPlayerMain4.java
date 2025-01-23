package basic.oop1;

/**
 * 객체 지향 프로그래밍 - 사물(=객체)의 속성과 기능을 하나로 묶어(=캡슐화) 정의하는 것
 */
public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 켜기
        player.on();
        // 볼륨 증가
        player.volumnUp();
        // 볼륨 증가
        player.volumnUp();
        // 볼륨 감소
        player.volumnDown();
        // 음악 플레이어 상태 확인
        player.showStatus();
        // 음악 플레이어 끄기
        player.off();
    }

}
