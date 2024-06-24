package Programmers.주사위게임1_181839;

public class basic {

  public static void main(String[] args) {
    int a = 2;
    int b = 4;
    int answer = solution(a, b);
    System.out.println(answer);
  }

  public static int solution(int a, int b) {

    if (a % 2 != 0 && b % 2 != 0) {
      return (int) (Math.pow(a, 2) + Math.pow(b, 2));
    } else if (a % 2 != 0 || b % 2 != 0) {
      return 2 * (a + b);
    } else {
      return Math.abs(a - b);
    }
  }

}
