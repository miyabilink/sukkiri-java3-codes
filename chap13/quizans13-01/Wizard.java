public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;
  public void heal(Hero h) {
    int basePoint = 10;                                   // 基本回復ポイント
    int recovPoint = (int)(basePoint * this.wand.power);  // 杖による増幅
    h.setHp(h.getHp() + recovPoint);                      // 勇者のHPを回復する
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }
}
