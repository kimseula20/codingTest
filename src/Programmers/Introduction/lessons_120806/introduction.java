package Programmers.Introduction.lessons_120806;

public class introduction {

  public static void main(String[] args) {
    int num1 = 7;
    int num2 = 3;

    int answer = solution(num1, num2);
    System.out.println(answer);
  }

  public static int solution(int num1, int num2) {
    double num = (double) num1 / (double) num2;
    return (int)Math.floor(num*1000);
  }

}
