package Programmers.Introduction.피자나눠먹기2_120815;

public class Introduction {

  public static void main(String[] args) {

    int n = 10;
    int answer = solution(n);
    System.out.println(answer);
  }

  public static int solution(int n) {
    int answer = 0;

    int pieces = 6;

    for ( int i = 1; i <= pieces * n; i++ ) { // 최소 1판부터니 1로 초기화
      if ( (pieces * i) % n == 0 ) {
        answer = i;
        break;
      }
    }

    return answer;
  }
}


