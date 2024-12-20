package ref.ex;

public class ProductOrderMain2 {
  public static void main(String[] args) {
    //ProductOrder 클래스 종류를 3개 담는 배열 생성
    ProductOrder[] products = new ProductOrder[3];

    ProductOrder dubu = createOrder("두부", 2000, 2);
    products[0] = dubu;

    ProductOrder kimchi = createOrder("김치", 5000, 1);
    products[1] = kimchi;

    ProductOrder cola = createOrder("콜라", 1500, 2);
    products[2] = cola;

    printOrders(products);

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
      System.out.println("상품 : " + p.productName + " 가격 : " + p.price + " 수량 : " + p.quantity);
    }
  }
}
