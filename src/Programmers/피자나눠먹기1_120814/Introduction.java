package Programmers.피자나눠먹기1_120814;

public class Introduction {

  public static void main(String[] args) {

    int n = 15;
    int answer = solution(n);
    System.out.println(answer);


  }

  public static int solution(int n) {
    return (n%7 == 0) ? n/7 : n/7+1;
  }

}
