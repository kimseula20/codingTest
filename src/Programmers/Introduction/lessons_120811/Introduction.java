package Programmers.Introduction.lessons_120811;

import java.util.Arrays;

public class Introduction {

  public static void main(String[] args) {
    int[] array = {9, -1, 0};

    int answer = solution(array);
    System.out.println(answer);
  }

  public static int solution(int[] array) {
    Arrays.sort(array);
    return array[array.length/2];
  }

}
