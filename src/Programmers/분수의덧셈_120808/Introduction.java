package Programmers.분수의덧셈_120808;

import java.util.Arrays;

public class Introduction {

  public static void main(String[] args) {
    int numer1 = 1;
    int denom1 = 2;
    int numer2 = 3;
    int denom2 = 4;

    int[] answer = solution(numer1, denom1, numer2, denom2);
    System.out.println(Arrays.toString(answer));

  }

  public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int numer = numer1*denom2 + numer2*denom1;
    int denom = denom1*denom2;

    int max = 1;

    for (int i =1; i<=numer && i<=denom; i++) {
      //최대공약수 찾기
      if (denom%i == 0 && numer%i == 0 ) {
        max = i;
      }
    }

    numer = numer/max;
    denom = denom/max;

    return new int[]{numer, denom};
  }
}
