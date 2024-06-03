package Be02Team.변수_연산자_조건문_반복문.변수_연산자;

import java.util.Scanner;

public class basic {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int money = sc.nextInt();
    int count;
    String printStr = "";

    count = money / 50000;
    printStr += "<오만원 " + count + "매, ";
    money %= 50000; // money -= count * 50000;


    count = money / 10000;
    printStr += "만원 " + count + "매, ";
    money %= 10000; // money %= 10000;

    count = money / 5000;
    printStr += "오천원 " + count + "매, ";
    money %= 5000;

    count = money / 1000;
    printStr += "천원 " + count + "매, ";
    money %= 1000;

    count = money / 500;
    printStr += "500원 " + count + "개, ";
    money %= 500;

    count = money / 100;
    printStr += "100원 " + count + "개, ";
    money %= 100;

    count = money / 50;
    printStr += "50원 " + count + "개, ";
    money %= 50;


    count = money / 10;
    printStr += "10원 " + count + "개";
    money %= 10;

    if(money > 0) {
      printStr += ", 1원 " + money + "개> 입니다.";
    } else {
      printStr += "> 입니다.";
    }

    System.out.println(printStr);

  }

}
