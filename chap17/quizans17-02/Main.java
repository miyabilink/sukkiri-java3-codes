public class Main {
  public static void main(String[] args) {
    try {
      String s = null;
      System.out.println(s.length());
    } catch (NullPointerException e) {
      System.out.println("NullPointerException例外をcatchしました");
      System.out.println("ーースタックトレース（ここから）ーー");
      e.printStackTrace();
      System.out.println("ーースタックトレース（ここまで）ーー");
    }
  }
}
