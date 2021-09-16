public class Main {
  public static int add(int x, int y) {
    return x + y;
  }
  public static int add(int x, int y, int z) {
    return x + y + z;
  }
  public static void main(String[] args){
    System.out.println("10+20=" + add(10, 20));
    System.out.println("10+20+30=" + add(10, 20, 30));
  }
}
