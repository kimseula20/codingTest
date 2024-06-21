package Programmers.Basic.접미사인지확인하기_181908;

public class basic {

  public static void main(String[] args) {
    String my_string = "banana";
    String is_suffix = "nan";

    int answer = solution(my_string, is_suffix);
    System.out.println(answer);
  }

  public static int solution(String my_string, String is_suffix) {

//    String reverse_my_string = "";
//    String reverse_is_suffix = "";
//    // my_string 문자열 reverse
//    for(int i = my_string.length()-1; i >= 0; i--) {
//      reverse_my_string += my_string.charAt(i);
//    }
//    // is_suffix 문자열 reverse
//    for(int i = is_suffix.length()-1; i >= 0; i--) {
//      reverse_is_suffix += is_suffix.charAt(i);
//    }

    StringBuilder sb = new StringBuilder(my_string);
    String reverse_my_string = sb.reverse().toString();

    StringBuilder sb1 = new StringBuilder(is_suffix);
    String reverse_is_suffix = sb1.reverse().toString();

    if (reverse_is_suffix.length() > reverse_my_string.length()) {
      return 0;
    }

    int count = 0;
    for (int i = 0; i < reverse_is_suffix.length(); i++) {
      if (reverse_my_string.charAt(i) == reverse_is_suffix.charAt(i)) {
        count++;
      }
    }

    if (count == reverse_is_suffix.length()) return 1;

    return 0;
  }

}
