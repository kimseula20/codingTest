package Programmers.Introduction.나이출력_120820;

public class Introduction {

  public static void main(String[] args) {
    int age = 40;
    int answer = solution(age);
    System.out.println(solution(answer));
  }

  public static int solution(int age) {

    return 2022 - age + 1;
  }

}
