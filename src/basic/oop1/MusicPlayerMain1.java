package basic.oop1;

/* 절차지향방식 프로그래밍 하기 1 */
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volumn = 0; //볼륨
        boolean isOn = false; //플레이어 On/Off

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플에이어를 시작합니다.");

        // 볼륨 증가
        volumn++;
        System.out.println("음악 플에이어 볼륨: " + volumn);
        // 볼륨 증가
        volumn++;
        System.out.println("음악 플에이어 볼륨: " + volumn);
        // 볼륨 감소
        volumn--;
        System.out.println("음악 플에이어 볼륨: " + volumn);

        // 음악 플레이어 상태 확인
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 On, 볼륨 : " + volumn);
        } else {
            System.out.println("음악 플레이어 Off, 볼륨 : " + volumn);
        }

        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
        
    }
}
