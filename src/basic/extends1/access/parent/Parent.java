package basic.extends1.access.parent;

public class Parent {
  public int publicValue;
  protected int protectedValue;
  int defaultValue;
  private int privateValue;

  public void publicMethod() {
    System.out.println("Parent.publicMethod");
  }
  public void protectedMethod() {
    System.out.println("Parent.protectedMethod");
  }
  public void defaultMethod() {
    System.out.println("Parent.defaultMethod");
  }
  public void privateMethod() {
    System.out.println("Parent.privateMethod");
  }

  public void printParent() {
    System.out.println("==Parent 메서드 안==");
    System.out.println("publicValue = " + publicValue);
    System.out.println("protectedValue = " + protectedValue);
    System.out.println("defaultValue = " + defaultValue);
    System.out.println("privateValue = " + privateValue);
  }

  
}
