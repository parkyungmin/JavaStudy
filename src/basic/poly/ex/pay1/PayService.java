package basic.poly.ex.pay1;

public class PayService {
  public void processPay(String option, int amount) {
    boolean result = false;
    System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

    //결제수단 선택
    Pay pay = ChoosePay(option);

    //결제 진행
    if (pay != null) {
      result = pay.pay(amount);
    }


    if (result) {
      System.out.println("결제가 성공했습니다.");
    } else {
      System.out.println("결제가 실패했습니다.");
    }
  }

  // 결제수단 선택
  static Pay ChoosePay(String option) {
    if (option.equals("kakao")) {
      return new KakaoPay();
    } else if (option.equals("naver")) {
      return new NaverPay();
    } else {
      System.out.println("결제 수단이 없습니다.");
      return null;
    }
  }
}
