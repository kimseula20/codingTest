package Programmers;
import java.util.Arrays;

/**
 * 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution
 * 함수를 완성해주세요.
 * <p>
 * num_list	           n	      result
 * [2, 1, 6]	         1	      [2]
 * [5, 2, 1, 7, 5]     3	      [5, 2, 1]
 */
public class basic2 {

  public static void main(String[] args) {
    int[] arr = {2, 1, 6};
    int[] answer = solution(arr, 1);
    System.out.println(Arrays.toString(answer));
  }

  public static int[] solution(int[] num_list, int n) {

    int[] answer = new int[n];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = num_list[i];
    }
    return answer;

  }

}
