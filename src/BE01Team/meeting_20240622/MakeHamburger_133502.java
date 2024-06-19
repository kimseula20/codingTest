package BE01Team.meeting_20240622;

import java.util.Arrays;

public class MakeHamburger_133502 {

  public static void main(String[] args) {
    int[] ingredient = {1, 2, 3, 1, 1, 2, 3, 1};
    int answer = solution(ingredient);
    System.out.println(answer);
  }

  public static int solution(int[] ingredient) {
    int answer = 0;

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < ingredient.length; i++) {
      sb.append(ingredient[i]);
      if (sb.length() > 3 && sb.charAt(sb.length() - 1) == '1' && sb.charAt(sb.length() - 2) == '3'
          && sb.charAt(sb.length() - 3) == '2' && sb.charAt(sb.length() - 4) == '1') {
        answer++;
        sb = new StringBuilder(sb.substring(0, sb.length() - 4));
      }
    }
    return answer;
  }

}
