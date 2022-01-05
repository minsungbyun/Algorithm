package algorithm;

public class Test {

  public static void main(String[] args) {


System.out.println("test");

  }
}



//    // 문자열 뒤집기
//
//    String word = "hello world";
//
//    // 문자열 분리한다.
//    String[] words = word.split("");
//    // 뒤집힌 문자열 담을 배열
//    String[] temp = new String[words.length];
//
//    for (String result : words) {
//      System.out.print(result);
//    }
//    System.out.println();
//    System.out.println("---------------");
//
//    String reverse = "";
//    for (int i = word.length() - 1; i >= 0; i--) {
//      reverse += word.charAt(i);
//    }
//    System.out.println(reverse);


//    StringBuilder sb = new StringBuilder(word);
//    String reverse = sb.reverse().toString();
//    System.out.println(reverse);



//    // 반대로 뒤집는다.
//
//    List<String> items = new ArrayList<>();
//
//    for (String item : words) {
//      items.add(item);
//    }
//
//    Collections.reverse(items);
//
//    //    for (int i = words.length; i > 0; i--) {
//    //      temp[i] = 
//    //    }
//
//
//    for (String result : items) {
//      System.out.print(result);
//    }




//    int[][] arr = new int[5][5];
//    int count = 0;
//
//    for (int i = 0; i < 5; i++) {
//      for (int j = 0; j < 5; j++) {
//        arr[i][j] = ++count;
//      }
//    }
//
//    for (int i = 0; i < 5; i++) {
//      for (int j = 0; j < 5; j++) {
//        if (arr[i][j] < 10) {
//          System.out.print(" " + arr[i][j] + " ");
//        } else {
//          System.out.print(arr[i][j] + " ");
//        }
//      }
//      System.out.println();
//    }