package basic.access;

public class Speaker {
//    int volumn; //절대 100을 넘으면 안된다.
    private int volumn; //private : 클래스 내부에서만 호출 가능하다.

    Speaker(int volumn) {
        this.volumn = volumn;
    }

    void volumnUp() {
        if (volumn >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volumn += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }
    void volumnDown() {
        volumn -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolumn() {
        System.out.println("현재 음량 : " + volumn);
    }
}
