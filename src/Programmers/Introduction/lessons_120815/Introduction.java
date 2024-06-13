package Programmers.Introduction.lessons_120815;

public class Introduction {

  public static void main(String[] args) {

    int n = 10;
    int answer = solution(n);
    System.out.println(answer);
  }

  public static int solution(int n) {
    int max = Math.max(n, 6); // a
    int min = Math.min(n, 6); // b

    // 최대 공약수
    while (min != 0) {  // c
      int r = max % min;
      max = min;
      min = r;
    }

    // 최소 공배수를 구한 뒤 피자 조각으로 나눔
    return (n * 6 / max)/6;
  }
}


