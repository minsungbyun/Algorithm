package algorithm;

public class VirticalGuguDan {
  public static void main(String[] args) {

    for(int i = 3; i <= 4; i++) {
      System.out.print("["+i+"단]\t\t"); // \t 칸 간격 벌림
    }
    System.out.println();

    for(int i = 1; i <= 9; i++) {
      for(int j = 3; j <= 4; j++){
        System.out.printf("%d x %d = %d\t", j, i, j * i);
      }
      System.out.println();
    }
  }
}
