package Programmers.Basic.원소들의곱과합_181929;

public class basic {

  public static void main(String[] args) {
    int[] arr = {3, 4, 5, 2, 1};
    int answer = solution(arr);
    System.out.println(answer);
  }

  public static int solution(int[] num_list) {

    int multiply = 1;
    int plus = 0;
    for (int i = 0; i < num_list.length; i++) {
      multiply *= num_list[i];
      plus += num_list[i];
    }

    return multiply < (plus*plus) ? 1 : 0;

  }

}
