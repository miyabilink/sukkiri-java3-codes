public class Thief extends Character {
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に7ポイントのダメージをあたえた！");
    m.hp -= 7;
  }
}
