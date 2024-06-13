package Programmers.Introduction.lessons_120812;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Introduction {

  public static void main(String[] args) {

    int[] array = {1, 2, 3, 3, 3, 4};
    int answer = solution(array);
//    System.out.println(answer);

  }

  public static int solution(int[] array) {


    int answer = 0;


    Arrays.sort(array);

    Map<Integer, Integer> map = new HashMap<>();

    for (int j : array) {
      if (map.containsKey(j)) {
        map.put(j, map.get(j) + 1);
      } else {
        map.put(j, 1);
      }
    }
    System.out.println(map);

    int max = 0;
    //TODO : 최빈값 구하기



    return answer;

  }

}
