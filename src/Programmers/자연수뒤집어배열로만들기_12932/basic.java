package Programmers.자연수뒤집어배열로만들기_12932;

import java.lang.module.ResolutionException;
import java.util.Arrays;

public class basic {

  public static void main(String[] args) {
    int n = 12345;
    int[] answer = solution(n);
    System.out.println(Arrays.toString(answer));
  }

  public static int[] solution(int n) {
    String s = String.valueOf(n);
    int[] answer = new int[s.length()];
    int idx = s.length()-1;
    for (int i = 0; i < s.length(); i++) {
      answer[i] = Integer.parseInt(String.valueOf(s.charAt(idx--)));
    }

    return answer;
  }

}
