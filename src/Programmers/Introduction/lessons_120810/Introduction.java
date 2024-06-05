package Programmers.Introduction.lessons_120810;

public class Introduction {

  public static void main(String[] args) {

    int num1 = 3;
    int num2 = 2;

    int answer = solution(num1, num2);
    System.out.println(answer);

  }

  public static int solution(int num1, int num2) {
    return num1 % num2;
  }

}
