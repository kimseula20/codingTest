package Programmers.Basic.lessons_181899;

import java.util.Arrays;

public class basic {

  public static void main(String[] args) {
    int start_num = 10;
    int end_num = 3;
    int[] answer = solution(start_num, end_num);
    System.out.println(Arrays.toString(answer));
  }

  public static int[] solution(int start_num, int end_num) {
    int length = start_num-end_num+1;
    int[] answer = new int[length];
    int start = start_num;
    for (int i = 0; i < length; i++) {
      answer[i] = start--;
    }
    return answer;
  }

}
