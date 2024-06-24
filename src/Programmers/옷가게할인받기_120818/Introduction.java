package Programmers.옷가게할인받기_120818;

public class Introduction {

  public static void main(String[] args) {
    int price = 100010;

    int answer = solution(price);
    System.out.println(answer);
  }

  public static int solution(int price) {

    if (price >= 100_000 && price < 300_000) return (int)Math.floor(price*0.95);
    else if (price >= 300_000 && price < 500_000) return (int)Math.floor((price*0.9));
    else if (price >= 500_000) return (int)Math.floor(price*0.8);

    return price;

  }

}
