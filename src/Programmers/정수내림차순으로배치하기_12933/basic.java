package Programmers.정수내림차순으로배치하기_12933;

import java.util.Arrays;

public class basic {

  public static void main(String[] args) {
    long n = 118372;
    long answer = solution(n);
    System.out.println(answer);
  }

  public static long solution(long n) {

    String[] arr = String.valueOf(n).split("");
    Arrays.sort(arr);

    StringBuilder sb = new StringBuilder();
    for (String array : arr) sb.append(array);

    return Long.parseLong(sb.reverse().toString());

  }

}
