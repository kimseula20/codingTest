package Programmers.Basic.접두사인지확인하기_181906;

public class basic {

  public static void main(String[] args) {
    String my_string = "aaabbbaaa";
    String is_prefix = "ab";

    int answer = solution(my_string, is_prefix);
    System.out.println(answer);
  }

  public static int solution(String my_string, String is_prefix) {

    if (is_prefix.length() > my_string.length()) {
      return 0;
    }

    int count = 0;
    for (int i = 0; i < is_prefix.length(); i++) {
      if (my_string.charAt(i) == is_prefix.charAt(i)) {
        count++;
      }
    }

    if (count == is_prefix.length()) return 1;

    return 0;
  }

}
