package Be02Team.meeting_20240608.메소드.Basic;

public class basic_1 {

  public static void main(String[] args) {
    int answer = add(10);
    System.out.println(answer);
  }

  public static int add(int a) {
    int sum = 0;
    for (int i = 1; i <= a; i++) {
      sum += i;
    }

    return sum;
  }

}
