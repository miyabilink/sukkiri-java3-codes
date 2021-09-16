public class KyotoCleaningShop implements CleaningService {
  String ownerName;    // 店主の名前
  String address;      // 住所
  String phone;        // 電話番号
  /* シャツを洗う */
  public Shirt washShirt(Shirt s) {
    // 大型洗濯機15分
    return s;
  }
  /* タオルを洗う */
  public Towl washTowl(Towl t) {
    // 大型洗濯機10分
    return t;
  }
  /* コートを洗う */
  public Coat washCoat(Coat c) {
    // ドライ20分
    return c;
  }
}
