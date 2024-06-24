package Programmers.배열의평균값_120817;

public class Introduction {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    double answer = solution(numbers);
    System.out.println(answer);
  }

  public static double solution(int[] numbers) {

    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    return (double) sum / numbers.length;
  }

}
