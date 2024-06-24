package Programmers.자릿수더하기_12931;

public class basic {

  public static void main(String[] args) {
    int n = 123;
    int answer = solution(n);
    System.out.println(answer);
  }

  public static int solution(int n) {
    int answer = 0;

    while(n > 0){
      answer += n%10;
      n/=10;
    }
    return answer;
  }
}
