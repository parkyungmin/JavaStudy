package basic.poly.ex.pay1;

public class PayService {
  public void processPay(String option, int amount) {
    boolean result = false; // 지역변수 초기화
    System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

    //결제수단 선택
    Pay pay = PayStore.ChoosePay(option);
    //결제 진행
    //Null 오브젝트 패턴 => NPE가 발생하는 것을 방지하기 위해 NULL값이 아닌 다른 객체 반환?
    //삭제 가능
//    if (pay != null) {
    result = pay.pay(amount);
//    }

    if (result) {
      System.out.println("결제가 성공했습니다.");
    } else {
      System.out.println("결제가 실패했습니다.");
    }
  }

}
