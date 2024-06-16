package Be02Team.meeting_20240615.클래스.middle;

import java.util.Arrays;

public class PhoneInfo {

  public int index = 0;
  String[] names = new String[1];
  String[] phoneNums = new String[1];


  public void insertPhoneInfo(String name, String phoneNum) {
    //매개변수로 전달된 이름과 번호를 각각의 배열에 저장하는 기능 구현
    if(index == names.length && index == phoneNums.length) {
      names = Arrays.copyOf(names, index+1);
      phoneNums = Arrays.copyOf(phoneNums, index+1);
    }
    names[index] = name;
    phoneNums[index] = phoneNum;
    index++;

  }

  public void printAllPhoneInfo() {
    //배열에 저장된 모든 이름과 번호를 순서대로 출력하는 기능 구현
    System.out.println("이름 : " + Arrays.toString(names));
    System.out.println("핸드폰번호 : " + Arrays.toString(phoneNums));
  }

  public void printPhoneInfo(int index) {
    //매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력하는 기능 구현
    System.out.printf("이름은 %s, 핸드폰번호는 %s", names[index], phoneNums[index]);
  }

}
