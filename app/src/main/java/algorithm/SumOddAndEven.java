package algorithm;

public class SumOddAndEven {
  public static void main(String[] args) {

    int odd = 0;
    int even = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 1) {
        odd += i;
      } else {
        even += i;
      }
    }

    System.out.println("홀수 합 => " + odd);
    System.out.println("짝수 합 => " + even);
  }
}
