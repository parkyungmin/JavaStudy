package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("입력할 주문의 개수를 입력하세요: ");
    int n = sc.nextInt();
    sc.nextLine(); // 오류방지 - 값 입력 후 엔터치면 다음줄에 빈값이 남아있는 에러가 있음.

    //ProductOrder 클래스 종류를 3개 담는 배열 생성
    ProductOrder[] products = new ProductOrder[n];
    for (int i=0; i<n; i++) {
      System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

      System.out.print("상품명: = ");
      String productName = sc.nextLine();

      System.out.print("가격: = ");
      int price = sc.nextInt();

      System.out.print("수량: = ");
      int quantity = sc.nextInt();
      sc.nextLine(); //입력 버퍼를 비우기 위한 코드 - nextInt다음에 nextLine을 읽으면 에러

      products[i] = createOrder(productName, price, quantity);
    }

    // 상품의 정보 출력
    printOrders(products);

    // 상품의 총 결제 금액 출력
    int totalAmount = getTotalAmount(products);
    System.out.println("총 결제 금액 : " + totalAmount);

  }

  static ProductOrder createOrder(String productName, int price, int quantity) {
    ProductOrder product = new ProductOrder();
    product.productName = productName;
    product.price = price;
    product.quantity = quantity;

    return product;
  }

  static void printOrders(ProductOrder[] orders) {
    for(ProductOrder p : orders) { //orders의 length만큼 반복문 돌며, ProductOrder p = orders[i]; 역할을 해 줌.
      System.out.println("상품 : " + p.productName + ", 가격 : " + p.price + ", 수량 : " + p.quantity);
    }
  }

  static int getTotalAmount(ProductOrder[] orders) {
    int totalAmount = 0;
    for (ProductOrder p : orders) {
      totalAmount += p.price * p.quantity;
    }
    return totalAmount;
  }
}
