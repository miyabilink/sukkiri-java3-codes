public class Hero {
  String name;
  int hp;
  Sword sword;
  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }
  public Hero(String name) {    // コンストラクタ①
    this.hp = 100;
    this.name = name;
  }
  public Hero() {    // コンストラクタ②
    this.Hero("ダミー");
  }
}
