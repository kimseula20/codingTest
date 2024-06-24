package Programmers.더크게합치기_181939;

public class basic {

  public static void main(String[] args) {

    int a = 9;
    int b = 91;

    int answer = solution(a, b);
    System.out.println(answer);
  }

  public static int solution(int a, int b) {
    int answer = 0;

    String a_str = Integer.toString(a);
    String b_str = Integer.toString(b);

    if(Integer.parseInt(a_str+b_str) == Integer.parseInt(b_str+a_str)) {
      return Integer.parseInt(a_str+b_str);
    }

    if(Integer.parseInt(a_str+b_str) > Integer.parseInt(b_str+a_str)) {
      return Integer.parseInt(a_str+b_str);
    } else {
      return Integer.parseInt(b_str+a_str);
    }

  }

}
