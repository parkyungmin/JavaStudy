package static2.ex;

public class MathArrayUtils {

  /**
   * 인스턴스 생성 못하도록 생성자를 private로 선언
   */
  private MathArrayUtils() {
    //
  }

  /**
   * 배열에 담긴 수들을 덧셈한다.
   */
  public static int sum(int[] values) {
    int result = 0;
    for (int i = 0; i < values.length; i++) {
      result += values[i];
    }
    /*
    // 향상된 for문 사용
    for (int value = values) {
      result += value;
    }
    */

    return result;
  }

  /**
   * 배열에 담긴 수들의 평균을 구한다.
   */
  public static double average(int[] values) {
    double result = 0;
    // 결과가 소수점이 나올 수 있으므로 sum을 double로 캐스팅
    result = (double) sum(values) / values.length; // 실수 / 정수는 실수가 나옴으로 결과를 실수값에 담아야한다.
    // 예를 들어 9.0 / 3 => 3이 3.0으로 자동 형 변환되고 값은 3.0이 나온다.
    // 정수 / 정수 => 소수점이 나오면 소수점은 절삭한다.


    return result;
  }

  /**
   * 배열에 담긴 수들 중 최솟값을 구한다.
   */
  public static int min(int[] values) {
//    int result = 0;
//    for (int i = 0; i < values.length; i++) {
//      if (i==0) {
//        result = values[0];
//      }  else {
//        if(result > values[i]) {
//          result = values[i];
//        }
//      }
//    }

    // 풀이
    int minValue =  values[0]; //첫번째값을 먼저 할당
    for (int value : values) {
      if (value < minValue) {
        minValue = value;
      }
    }

    return minValue;
  }

  /**
   * 배열에 담긴 수들 중 최댓값을 구한다.
   */
  public static int max(int[] values) {
//    int result = 0;
//    for (int i = 0; i < values.length; i++) {
//      if (i==0) {
//        result = values[0];
//      }  else {
//        if(result < values[i]) {
//          result = values[i];
//        }
//      }
//    }

    // 풀이
    int maxValue =  values[0]; //첫번째값을 먼저 할당
    for (int value : values) {
      if (value > maxValue) {
        maxValue = value;
      }
    }

    return maxValue;
  }
}
