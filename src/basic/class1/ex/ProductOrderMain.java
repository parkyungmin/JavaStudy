package basic.class1.ex;

public class ProductOrderMain {
  public static void main(String[] args) {
    //여러 상품의 주문 정보를 담는 배열 생성
    ProductOrder[] products = new ProductOrder[3];

    ProductOrder dubu = new ProductOrder();
    dubu.productName = "두부";
    dubu.price = 2000;
    dubu.quantity = 2;
    products[0] = dubu; //배열에 두부 참조값 저장

    ProductOrder kimchi = new ProductOrder();
    kimchi.productName = "김치";
    kimchi.price = 5000;
    kimchi.quantity = 1;
    products[1] = kimchi;

    ProductOrder cola = new ProductOrder();
    cola.productName = "콜라";
    cola.price = 1500;
    cola.quantity = 2;
    products[2] = cola;

    int sum = 0; //총 결제 금액

    //상품 주문 정보와 최종 금액 출력
    for(ProductOrder p : products) {
      sum += p.price * p.quantity;
      System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
    }

    //총 결제 금액 출력
    System.out.println("총 결제 금액: " +  sum);

  }
}
