public class Main {
  public static int[] makeArray(int size) {
    int[] newArray = new int[size];
    for (int i = 0; i < newArray.length; i++ ) {
      newArray[i] = i;
    }
    return newArray;
  }
  public static void main(String[] args) {
    int[] array = makeArray(3);
    for (int i : array) {
      System.out.println(i);
    }
  }
}
