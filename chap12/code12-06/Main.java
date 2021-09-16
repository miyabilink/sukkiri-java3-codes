public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    Hero h2 = new Hero();
    Thief t1 = new Thief();
    Wizard w1 = new Wizard();
    Wizard w2 = new Wizard();
    // 冒険開始！
    // まず宿屋に泊まる
    h1.hp += 50;
    h2.hp += 50;
    t1.hp += 50;
    w1.hp += 50;
    w2.hp += 50;
  }
}
