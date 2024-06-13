package Programmers.Introduction.lessons_120816;

public class Introduction {

  public static void main(String[] args) {
    int slice = 7;
    int n = 10;

    int answer = solution(slice, n);
    System.out.println(answer);
  }

  public static int solution(int slice, int n) {

    if(n%slice == 0)
      return n/slice;
    else
      return n/slice + 1;

  }

}
