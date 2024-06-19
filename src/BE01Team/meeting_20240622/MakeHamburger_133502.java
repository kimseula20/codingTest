package BE01Team.meeting_20240622;

import java.util.Arrays;

public class MakeHamburger_133502 {

  public static void main(String[] args) {
    int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
    int answer = solution(ingredient);
    System.out.println(answer);
  }

  public static int solution(int[] ingredients)
  {
    int answer = 0;
    String hamburger = "1231";
    String standard = Arrays.toString(ingredients).replace(",", "").replace(" ", "").replace("[", "").replace("]", "");

    if(standard.contains(hamburger)) {
      while (standard.contains(hamburger)) {
        standard = standard.replace(hamburger, "");
        answer++;
      }
    }

    return answer;
  }

}
