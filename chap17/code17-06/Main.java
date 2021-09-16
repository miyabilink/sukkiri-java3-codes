import java.io.*;

public class Main {
  public static void main(String[] args) {
    FileWriter fw = new FileWriter("data.txt");
    try {
      fw.write("hello!");
    } catch (Exception e) {
      System.out.println("何らかの例外が発生しました");
    } finally {
      fw.close();
    }
  }
}
