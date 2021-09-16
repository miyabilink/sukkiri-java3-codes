public class Hero {
  String name;
  int hp;

  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
}
