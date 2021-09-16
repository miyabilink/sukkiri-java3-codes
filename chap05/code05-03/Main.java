public class Main {
  public static void methodA() {
    System.out.println("methodA");
    methodB();
  }
  public static void methodB() {
    System.out.println("methodB");
  }
  public static void main(String[] args) {
    methodA();
  }
}
