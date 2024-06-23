package BE01Team.meeting_20240626;


public class CaesarCipher_12926 {

  public static void main(String[] args) {
    String s = "z";
    int n = 1;
    String answer = solution(s, n);
    System.out.println(answer);
  }

  public static String solution(String s, int n) {

    String answer = "";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (ch == ' ') {
        answer += ch;
        continue;
      }

      if (Character.isLowerCase(ch)) {
        answer += (ch+n > 'z') ? (char) (ch - 26 + n) : (char) (ch + n);
      } else if (Character.isUpperCase(ch)) {
        answer += (ch+n > 'Z') ? (char) (ch - 26 + n) : (char) (ch + n);
      }

    }

    return answer;
  }

}
