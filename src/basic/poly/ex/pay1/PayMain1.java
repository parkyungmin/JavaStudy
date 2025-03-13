package basic.poly.ex.pay1;

import java.util.Scanner;

public class PayMain1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //System.in을 사용하여 버퍼(임시 저장공간)에 저장된 데이터를 scnnaer를 통해 읽어온다.
    PayService payService = new PayService();

    while (true) {
      System.out.println("결제수단을 입력하세요 : ");
      String payOption = scanner.nextLine(); //남은 개행 문자(Enter : '\n')를 읽어서 버퍼를 비움

      if (payOption.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        return;
      }

      System.out.println("결제 금액을 입력하세요 : ");
      int amount = scanner.nextInt(); //숫자만 읽고 개행 문자(Enter : '\n')는 버퍼에 남김
      scanner.nextLine(); //개행문자 소비하여 버퍼를 지움

      payService.processPay(payOption, amount);
    }
  }
}
