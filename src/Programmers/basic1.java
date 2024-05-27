package Programmers;
import java.util.Arrays;

/**
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * num_list	            n	      result
 * [4, 2, 6, 1, 7, 6]	  2	      [4, 6, 7]
 * [4, 2, 6, 1, 7, 6]	  4	      [4, 7]
 */
public class basic1 {

  public static void main(String[] args) {

    int[] arr = {4, 2, 6, 1, 7, 6, 9, 10, 11};
    int n = 4;
    int[] answer = solution(arr, n);
    System.out.println(Arrays.toString(answer));

  }

  public static int[] solution(int[] num_list, int n) {

    int length = num_list.length%n == 0 ? num_list.length / n : num_list.length / n + 1;
    int[] answer = new int[length];

    for (int i = 0; i < answer.length; i++) {
      answer[i] = num_list[i * n];
    }
    return answer;
  }

}
