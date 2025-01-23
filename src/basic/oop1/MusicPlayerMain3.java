package basic.oop1;

/* 절차지향방식 프로그래밍 하기 3 - 메서드 추출(각 각의 기능이 모듈화 됨) */

/* 특징 : 데이터는 MusicPlayerData에 있고 해당 기능들은 MusicPlayerMain3에 있어 떨어져 있음. */
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);
        // 볼륨 증가
        volumnUp(data);
        // 볼륨 증가
        volumnUp(data);
        // 볼륨 감소
        volumnDown(data);
        // 음악 플레이어 상태 확인
        showStatus(data);
        // 음악 플레이어 끄기
        off(data);

    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플에이어를 시작합니다.");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumnUp(MusicPlayerData data) {
        data.volumn++;
        System.out.println("음악 플에이어 볼륨: " + data.volumn);
    }
    static void volumnDown(MusicPlayerData data) {
        data.volumn--;
        System.out.println("음악 플에이어 볼륨: " + data.volumn);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");

        if (data.isOn) {
            System.out.println("음악 플레이어 On, 볼륨 : " + data.volumn);
        } else {
            System.out.println("음악 플레이어 Off, 볼륨 : " + data.volumn);
        }
    }

}
