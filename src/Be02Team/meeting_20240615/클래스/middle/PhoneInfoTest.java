package Be02Team.meeting_20240615.클래스.middle;

public class PhoneInfoTest {

  public static void main(String[] args) {

    PhoneInfo phoneInfo = new PhoneInfo();

    phoneInfo.insertPhoneInfo("홍길동", "010-1234-1234");
    phoneInfo.insertPhoneInfo("임꺽정", "010-4567-4567");

    phoneInfo.printAllPhoneInfo();
    phoneInfo.printPhoneInfo(1);

  }

}
