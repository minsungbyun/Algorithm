package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockPaperScissors {

  public static void main(String[] args) throws IOException {

    // 컴퓨터랑 가위,바위,보 게임을 한다.
    // 컴퓨터는 랜덤으로 숫자가 부여되며 사용자는 숫자를 입력한다.
    // 가위 = 1, 바위 = 2, 보 = 3

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("[ ★★컴퓨터와 가위바위보 대결을 합니다!★★ ]");

    while (true) {
      System.out.print("정수를 입력해주세요 (가위 = 1, 바위 = 2, 보 = 3) > ");
      int me = Integer.parseInt(br.readLine());
      if (!(me == 1 || me == 2 || me == 3)) {
        System.out.println("다시 입력해주세요\n");
        continue;
      }
      int com = (int) (Math.random() * 3) + 1;
      int result = me - com;

      /**                 
       *          가위    바위    보  (나)
       *    가위     0     1      2 
       *    
       *    바위    -1     0      1
       *    
       *      보    -2     -1     0
       *      
       *  (컴퓨터) 
       */

      switch (result) {
        case -2: case 1: System.out.println("당신이 이겼습니다."); break;
        case -1: case 2: System.out.println("컴퓨터가 이겼습니다."); break;
        case 0: System.out.println("무승부입니다."); break;
      }
      System.out.println();
    }
  }
}
