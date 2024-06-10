package Be02Team.meeting_20240608.메소드.Middle;

import java.util.Arrays;

public class middle {

  public static void main(String[] args) {
    char[] ch = {'y', 'B', 'c', 'D'};
    char[] ch2 = convertArr(ch);
    System.out.println(Arrays.toString(ch2));
  }

  public static char[] convertArr(char[] ch) {

    char[] result = new char[ch.length];

    for (int i = 0; i < ch.length; i++) {

      if (ch[i] >= 'a' && ch[i] <= 'z') {
        if(ch[i] == 'z') {
          result[i] = 'A';
        } else {
          result[i] = (char) (ch[i] - 31);
        }
      } else {
        if(ch[i] == 'A') {
          result[i] = 'z';
        } else {
          result[i] = (char) (ch[i] + 31);
        }
      }
    }

    return result;
  }

}
