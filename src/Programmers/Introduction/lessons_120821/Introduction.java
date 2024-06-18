package Programmers.Introduction.lessons_120821;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Introduction {

  public static void main(String[] args) {
    int[] num_list = {1, 2, 3, 4, 5};
    int[] answer = solution(num_list);
    System.out.println(Arrays.toString(answer));
  }

  public static int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length];
    for(int i=0; i<num_list.length; i++){
      answer[num_list.length-i-1] = num_list[i];
    }
    return answer;
  }

}
