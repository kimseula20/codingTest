package Programmers.Introduction.숫자비교하기_120807;

public class introduction {

  public static void main(String[] args) {
    int num1 = 2;
    int num2 = 3;

    int answer = solution(num1, num2);
    System.out.println(answer);
  }

  public static int solution(int num1, int num2) {
    return (num1 == num2) ? 1 : -1;
  }

}
