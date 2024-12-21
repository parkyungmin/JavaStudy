package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); //패키지가 동일
        pack.a.User user = new pack.a.User(); // 패캐지의 위치가 다르면 전체 경로 포함해서 클래스를 적어준다.

    }
}
