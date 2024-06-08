package Be02Team.meeting_20240608.메소드.Basic;

public class basic_4 {

  public static void main(String[] args) {
    int [] arr = {1, 3, 2, 5, 6, 9};
    reverseArrPrint(arr);
  }

  public static void reverseArrPrint(int[] arr) {

    for (int i = arr.length-1; i >= 0; i--) {
      System.out.println(arr[i]);
    }

  }

}
