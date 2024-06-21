package Programmers.Basic.배열만들기1_181901;

import java.util.Arrays;

public class basic {

  public static void main(String[] args) {
    int n = 10;
    int k = 3;

    int[] answer = solution(n, k);
    System.out.println(Arrays.toString(answer));
  }

  public static int[] solution(int n, int k) {

    int[] answer = new int[n/k];
    for (int i =0; i < answer.length; i++) {
      answer[i] = (i+1)*k;
    }
    return answer;
  }

}
