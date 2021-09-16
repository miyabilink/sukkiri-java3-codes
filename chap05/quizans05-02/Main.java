public class Main {
  public static void main(String[] args) {
    String title = "お誘い";
    String address = "uso800@xxxx.com";
    String text = "今度、飲みにいきませんか";
    email(title, address, text);
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}
