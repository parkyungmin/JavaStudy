package basic.poly.ex.pay1;

public abstract class PayStore { //Abstract로 선언하는 이유는 객체 생성을 못하도록 하기 위해서이다.
  // 결제수단 선택
  public static Pay ChoosePay(String option) {
    if (option.equals("kakao")) {
      return new KakaoPay();
    } else if (option.equals("naver")) {
      return new NaverPay();
    }  else if (option.equals("newPay")) {
      return new NewPay();
    } else {
      return new DefaultPay(); //false 값 반환
//      return null;
    }
  }
}
