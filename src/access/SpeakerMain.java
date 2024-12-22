package access;

/**
 * 접근제어자
 * 문제점1 - 필드에 직접 접근이 가능하여 볼륨이 100을 넘어 버릴 수 있다.
 */
public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolumn();

        speaker.volumnUp();
        speaker.showVolumn();

        speaker.volumnUp();
        speaker.showVolumn();

        //필드에 직접 접근
        System.out.println("volumn 필드 직접 접근 수정");
//        speaker.volumn = 200;
        speaker.showVolumn();
    }
}
