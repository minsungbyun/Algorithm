package algorithm;

public class CountChar {
  public static void main(String[] args) {

    String str = "apple";
    System.out.println(countChar(str, 'a')); // 1
    System.out.println(countChar(str, 'p')); // 2
    System.out.println(countChar(str, 'l')); // 1
    System.out.println(countChar(str, 'e')); // 1
    System.out.println(countChar(str, 'c')); // 0

  }

  static int countChar(String str, char c) {
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == c) {
        count++;
      }
    }
    return count;
  }

}
