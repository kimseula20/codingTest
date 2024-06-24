package Programmers.아이스아메리카노_120819;

import java.util.Arrays;

public class Introduction {

  public static void main(String[] args) {
    int money = 15_000;
    int[] answer = solution(money);
    System.out.println(Arrays.toString(answer));
  }
  
  public static int[] solution(int money) {
    return new int[] { money / 5500, money % 5500 };
  }

}
