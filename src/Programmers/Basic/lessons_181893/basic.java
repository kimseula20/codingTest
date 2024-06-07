package Programmers.Basic.lessons_181893;

import java.util.Arrays;

public class basic {

  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4, 5};
    int[] query = {4, 1, 2};
    int[] answer = solution(arr, query);
  }

  public static int[] solution(int[]arr, int[] query) {

    for (int i = 0; i < query.length; i++) {
      if(i%2 == 0) {
        arr = Arrays.copyOfRange(arr, 0, query[i]+1);
      } else {
        arr = Arrays.copyOfRange(arr, query[i], arr.length);
      }
    }
    return arr;
  }

}
