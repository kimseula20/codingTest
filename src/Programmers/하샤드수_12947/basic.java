package Programmers.하샤드수_12947;

public class basic {

  public static void main(String[] args) {
    int x = 11;

    boolean answer = solution(x);
    System.out.println(answer);

  }

  public static boolean solution(int x) {
    String[] temp = String.valueOf(x).split("");

    int sum = 0;
    for (String s : temp) {
      sum += Integer.parseInt(s);
    }

    return x % sum == 0;
  }

}
