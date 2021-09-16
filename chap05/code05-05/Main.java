public class Main {
  public static void main(String[] args) {
    add(100, 20);
    add(200, 50);
  }
  // 複数の値を受け取るaddメソッド
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}
