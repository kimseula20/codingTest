package Programmers._2의영역_181894;

import java.util.Arrays;

public class basic {

  public static void main(String[] args) {
    int[] arr = {1, 1, 1};
    int[] answer = solution(arr);
    System.out.println(Arrays.toString(answer));
  }

  public static int[] solution(int[] arr) {
    int min = 100000, max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 2) {
        min = Math.min(min, i);
        max = Math.max(max, i);
      }
    }

    if (min <= max) {
      return Arrays.copyOfRange(arr, min, max + 1);
    } else {
      return new int[]{-1};
    }
  }

}
