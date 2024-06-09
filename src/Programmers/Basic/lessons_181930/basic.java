package Programmers.Basic.lessons_181930;

public class basic {

  public static void main(String[] args) {

    int a = 2;
    int b = 6;
    int c = 1;
    int answer = solution(a, b, c);
    System.out.println(answer);
  }

  public static int solution(int a, int b, int c) {

    if (a == b && b == c) {
      return (int) ((Math.pow(a, 1) * 3) * (Math.pow(a, 2) * 3) * (Math.pow(a, 3) * 3));
    } else if (a == b || b == c || a == c) {
      return (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    } else {
      return (a + b + c);
    }
  }
}
