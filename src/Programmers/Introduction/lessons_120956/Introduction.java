package Programmers.Introduction.lessons_120956;

public class Introduction {

  public static void main(String[] args) {

    String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
    int answer = solution(babbling);
    System.out.println(answer);

  }

  public static int solution(String[] babbling) {
    int answer = 0;

    for (int i = 0; i < babbling.length; i++) {

      babbling[i] = babbling[i].replace("aya", " ");
      babbling[i] = babbling[i].replace("ye", " ");
      babbling[i] = babbling[i].replace("woo", " ");
      babbling[i] = babbling[i].replace("ma", " ");
      babbling[i] = babbling[i].replace(" ", "");

      if (babbling[i].isEmpty()) {
        answer++;
      }
    }

    // 정규표현식을 이용한 풀이
//    for (String s : babbling) {
//      if (s.matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
//        answer++;
//      }
//    }

    return answer;
  }

}
