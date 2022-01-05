package algorithm;

public class StaticAndInstance {

  // 다음 결과를 예측하시오
  static String a = "";
  String b = "";

  public StaticAndInstance() {
    a += "S";
    b += "S";
  }

  void append(String word) {
    a += word;
    b += word;
  }

  public static void main(String[] args) {

    StaticAndInstance a = new StaticAndInstance();
    StaticAndInstance b = new StaticAndInstance();

    System.out.println(StaticAndInstance.a);
    a.append("UCESS");
    System.out.println(StaticAndInstance.a);
    System.out.println(b.b);
    


  }
}
