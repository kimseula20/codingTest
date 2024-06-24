package Programmers.문자열내p와y의개수_12916;

public class basic {

  public static void main(String[] args) {
    String s = "Pyy";
    boolean answer = solution(s);
    System.out.println(answer);
  }

  public static boolean solution(String s) {

    s = s.toLowerCase();
    int cnt = 0;

    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == 'p') {
        cnt++;
      }
      if(s.charAt(i) == 'y') {
        cnt--;
      }
    }

    return cnt == 0;
  }

}
