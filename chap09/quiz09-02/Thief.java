public class Thief {
  String name;
  int hp;
  int mp;

  public Thief(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }
  public Thief(String name, int hp) {
    this(name, hp, 5);
  }
  public Thief(String name) {
    this(name, 40);
  }
}
