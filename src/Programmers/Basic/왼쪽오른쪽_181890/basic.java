package Programmers.Basic.왼쪽오른쪽_181890;

import java.util.Arrays;

public class basic {

  public static void main(String[] args) {

    String[] str_list = {"u", "u", "l", "r"};
    String[] answer = solution(str_list);
    System.out.println(Arrays.toString(answer));
  }

  public static String[] solution(String[] str_list) {

    String[] answer = {};
    for (int i = 0; i < str_list.length;i++) {
      if (str_list[i].equals("l")) {
        return Arrays.copyOfRange(str_list, 0, i);
      } else if (str_list[i].equals("r")) {
        return Arrays.copyOfRange(str_list, i + 1, str_list.length);
      }
    }
    return answer;
  }

}
