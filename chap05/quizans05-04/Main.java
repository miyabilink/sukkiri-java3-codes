public class Main {
  public static void main(String[] args) {
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積：" + triangleArea + "平方cm");
    double circleArea = calcCircleArea(5.0);
    System.out.println("円の面積：" + circleArea + "平方cm");
  }
  public static double calcTriangleArea(double bottom, double height) {
    double area = (bottom * height) / 2;
    return area;
  }
  public static double calcCircleArea(double radius) {
    double area = radius * radius * 3.14;
    return area;
  }
}
