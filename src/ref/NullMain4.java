package ref;

public class NullMain4 {
  public static void main(String[] args) {
    BigData bingData = new BigData();
    bingData.data = new Data(); //data 멤버변수

    System.out.println("bigData.count = " + bingData.count); // 0 출력
    System.out.println("bigData.count = " + bingData); // 값 출력
    System.out.println("bigData.count = " + bingData.data); // 값 출력

    System.out.println("bigData.count = " + bingData.data.value); // 0 출력

  }
}
