package basic.static1;

public class Data1 {
  public String name;
  public int count; //생성된 객체의 수 count

  public Data1(String name) {
    this.name = name;
    count++;
  }
}
