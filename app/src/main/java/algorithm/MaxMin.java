package algorithm;

public class MaxMin {

  public static void main(String[] args) {

    int a = 40, b = 30, c = 45;
    int max, min;
    max = (a > b && a > c) ? a : (b > c) ? b : c;
    min = (a < b && a < c) ? a : (b < c) ? b : c;
    System.out.println("최댓값 : " + max);
    System.out.println("최솟값 : " + min);

    //    int a = 40, b = 30, c = 45;
    //    int max = a > b ? a : b;
    //    max = max > c ? max : c;
    //    int min = a < b ? a : b;
    //    min = min < c ? min : c;
    //    System.out.println("최댓값 : " + max);
    //    System.out.println("최솟값 : " + min);

  }

}
