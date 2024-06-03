package Be02Team.meeting_20240601.변수_연산자_조건문_반복문.변수_조건문;

import java.util.Scanner;

public class basic {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count;

    if(num >= 1 && num <= 99) {

      int tenNum = num / 10;
      int oneNum = num - tenNum * 10;
      count = 0;

      if(tenNum > 0 && tenNum % 3 == 0) {
        count++;
      }

      if(oneNum > 0 && oneNum % 3 == 0) {
        count++;
      }

      if(count == 1) {
        System.out.println("박수짝");
      } else if(count == 2) {
        System.out.println("박수짝짝");
      } else {
        System.out.println("3, 6, 9를 찾을 수 없습니다.");
      }
    } else {
      System.out.println("99이하의 수만 입력하세요.");
    }

  }

}
