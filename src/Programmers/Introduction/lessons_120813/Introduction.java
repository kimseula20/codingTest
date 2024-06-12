package Programmers.Introduction.lessons_120813;

import java.util.Arrays;

public class Introduction {

  public static void main(String[] args) {
    int n = 10;
    int[] answer = solution(n);
    System.out.println(Arrays.toString(answer));
  }

  public static int[] solution(int n) {

    int length = (n%2 != 0) ? (n/2)+1 : n/2;
    int[] answer = new int[length];
    int idx = 0;
    for (int i = 1; i <= n; i++) {
      if(i%2 != 0) answer[idx++] = i;
    }
    return answer;
  }

}
