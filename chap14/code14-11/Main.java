public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    Hero h2 = new Hero();
    Hero.money = 100;
    System.out.println(Hero.money);
    System.out.println(h1.money);
    h1.money = 300;
    System.out.println(h2.money);
  }
}
