package Programmers.Introduction.lessons_120809;

import java.util.Arrays;

public class Introduction {

  public static void main(String[] args) {

    int[] numbers = {1,2,3,4,5};
    int[] answer = solution(numbers);
    System.out.println(Arrays.toString(answer));

  }

  public static int[] solution(int[] numbers) {
    int[] answer = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      answer[i] = numbers[i] * 2;
    }
    return answer;
  }

}
