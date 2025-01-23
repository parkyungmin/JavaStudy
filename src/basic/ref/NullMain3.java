package basic.ref;

public class NullMain3 {
  public static void main(String[] args) {
    BigData bingData = new BigData();
    System.out.println("bigData.count = " + bingData.count); //0 출력
    System.out.println("bigData.count = " + bingData.data); //null 출력

    System.out.println("bigData.count = " + bingData.data.value); //null.value는 NullPointerError 출력

  }
}
