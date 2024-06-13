## 6월 22일까지 해와야하는 문제

### [Basic]
1. Rect 클래스를 생성하세요. int width, int height를 필드로 갖고
   기본생성자와 모든 필드를 초기화하는 생성자 두 개를 정의하세요.
   그리고 사각형의 둘레를 리턴하는 메소드와 사각형의 넓이를 리턴하는 메소드를 구현하세요.

---

2. User 클래스를 생성하세요. long id, String username, String password를 필드로 가지고
   getter, setter 메소드를 구현하세요. id, username, password 필드는 private으로 지정합니다.


### [Middle]

1. PhoneInfo 클래스를 생성하세요.
```
String[] names = new String[1];
String[] phoneNums = new String[1];

int index = 0;

public void insertPhoneInfo(String name, String phoneNum) {
//매개변수로 전달된 이름과 번호를 각각의 배열에 저장하는 기능 구현
//선언한 배열의 길이에 데이터가 꽉찰 경우 배열의 길이 늘려서 새로운 데이터 추가하는 기능 구현

}

public void printAllPhoneInfo() {
//배열에 저장된 모든 이름과 번호를 순서대로 출력하는 기능 구현
}

public void printPhoneInfo(int index) {
//매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력하는 기능 구현
}
```

### [advance]
1. UserBook 클래스를 생성하세요.
   basic 2번 문제에서 만든 User클래스 타입의 값을 100개 저장할 수 있는
   배열과 현재 배열에 위치를 저장하는 index를 필드로 생성합니다.
   매개변수로 username과 password를 받아서 User 객체를 생성하여
   배열에 저장하는 메소드 saveUserInfo를 구현하세요. 이 때 User의 id는
   index + 1로 지정합니다.


### 프로그래머스 문제
+ 주사위 게임 1

  https://school.programmers.co.kr/learn/courses/30/lessons/181839
+ 주사위 게임 2

  https://school.programmers.co.kr/learn/courses/30/lessons/181930
