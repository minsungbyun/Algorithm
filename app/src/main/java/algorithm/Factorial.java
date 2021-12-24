package algorithm;

public class Factorial {

  public static void main(String[] args) {
    int input = 4; // 4!

    System.out.println(fact(input));
  }

  private static int fact(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fact(n - 1) * n;
    } 
  }
}

// 또 다른 방법

// System.out.println("팩토리얼 계산을 위한 정수값 입력");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int fac = 1;    // 초기값 설정
// for (int i = num; i > 0; i--) { 
//   // (int i=1; i<=num; i++) 조건식을 다음과 같이 변경해도 동일하게 동작한다.
//   fac = fac * i;  // fac *= i; 
// }
// System.out.println(num + "! = " + fac);

