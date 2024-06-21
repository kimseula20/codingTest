package Programmers.Basic.첫번째로나오는음수_181896;

public class basic {

  public static void main(String[] args) {
    int[] arr = {12, 4, 15, 46, 38, -2, 15};
    int answer = solution(arr);
    System.out.println(answer);
  }

  public static int solution(int[] num_list) {

    for (int i = 0; i < num_list.length; i++) {
      if(num_list[i] < 0) {
        return i;
      }
    }
    return -1;
  }

}
