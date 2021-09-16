public class Account {
  String accountNumber;    // 口座番号
  int balance;             // 残額
  /* ①文字列表現のメソッド */
  public String toString() {
    return "¥¥" + this.balance + "（口座番号：" + this.accountNumber + "）";
  }
  /* ②等価判定のメソッド */
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof Account) {
      Account a = (Account)o;
      String an1 = this.accountNumber.trim();
      String an2 = a.accountNumber.trim();
      if (an1.equals(an2)) {
        return true;
      }
    }
    return false;
  }
}
