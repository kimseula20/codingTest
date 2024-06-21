package Programmers.Basic.n번째원소부터_181892;

import java.util.Arrays;

public class basic {

  public static void main(String[] args) {

    int[] arr = {5, 2, 1, 7, 5};
    int[] answer = solution(arr, 2);
    System.out.println(Arrays.toString(answer));
  }

  public static int[] solution(int[] num_list, int n) {

    int[] answer = new int[num_list.length-n+1];
    int index = n-1;
    for (int i = 0; i < (num_list.length-n+1); i++) {
      answer[i] = num_list[index];
      index++;
    }

    return answer;
  }

}
