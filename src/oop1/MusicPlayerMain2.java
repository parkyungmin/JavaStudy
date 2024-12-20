package oop1;

/* 절차지향방식 프로그래밍 하기 2 - MusicPlayer 데이터와 관련된 것을 하나의 클래스로 묶기 */
public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플에이어를 시작합니다.");

        // 볼륨 증가
        data.volumn++;
        System.out.println("음악 플에이어 볼륨: " + data.volumn);
        // 볼륨 증가
        data.volumn++;
        System.out.println("음악 플에이어 볼륨: " + data.volumn);
        // 볼륨 감소
        data.volumn--;
        System.out.println("음악 플에이어 볼륨: " + data.volumn);

        // 음악 플레이어 상태 확인
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 On, 볼륨 : " + data.volumn);
        } else {
            System.out.println("음악 플레이어 Off, 볼륨 : " + data.volumn);
        }

        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
        
    }
}
