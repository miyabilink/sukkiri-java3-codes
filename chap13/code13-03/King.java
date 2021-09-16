public class King {
  public void talk(Hero h) {
    System.out.println("王様：ようこそ我が国へ、勇者" + h.name + "よ。");
    System.out.println("王様：長旅疲れたであろう。");
    System.out.println("王様：まずは城下町を見てくるとよい。ではまた会おう。");
    h.die();
    /* … */
  }
}
