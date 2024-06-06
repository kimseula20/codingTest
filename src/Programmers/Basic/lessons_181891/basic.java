package Programmers.Basic.lessons_181891;

import java.util.Arrays;

public class basic {

  public static void main(String[] args) {

    int[] num_list = {2, 1, 6};
    int n = 1;

    int[] answer = solution(num_list, n);
    System.out.println(Arrays.toString(answer));
  }

  public static int[] solution(int[] num_list, int n) {
    int[] answer = new int[num_list.length];
    int index = 0;

    for (int i = n; i < num_list.length; i++) {
      answer[index++] = num_list[i];
    }

    for (int i = 0; i< n; i++) {
      answer[index++] = num_list[i];
    }
    return answer;
  }

}
