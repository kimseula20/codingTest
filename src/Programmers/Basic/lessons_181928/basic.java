package Programmers.Basic.lessons_181928;

import java.util.Arrays;

public class basic {

  public static void main(String[] args) {

    int[] arr = {3, 4, 5, 2, 1};
    int answer = solution(arr);
    System.out.println(answer);
  }

  public static int solution(int[] num_list) {

    String odd_number = "";
    String even_number = "";

    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] % 2 == 0) {
        even_number += Integer.toString(num_list[i]);
      } else {
        odd_number += Integer.toString(num_list[i]);
      }
    }

    return Integer.parseInt(even_number) + Integer.parseInt(odd_number);
  }

}
