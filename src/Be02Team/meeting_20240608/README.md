## 6월 15일까지 해와야하는 문제

### [Basic] 
1. int 값을 하나 매개변수로 전달받아서 1부터 매개변수로 전달된 값까지의 총합을 구해서 총합을 리턴하는 메소드를 구현하세요. 

    실행클래스의 메인메소드 아래에 static 메소드로 선언하세요. 

    static의 위치는 접근제어자와 리턴타입 사이입니다. 

    (예시 public static void add() {})

---

2. ConcatString 클래스를 하나 만들고 String 타입의 값 2개를 매개변수로 받아서 문자열 결합을 진행하고 결합된 문자열을 리턴하는 메소드를 구현하세요.

---

3. 2번에서 만든 메소드를 오버로딩해서 String 타입의 값 2개와 int 타입의 값 1개를 매개변수로 받아서 문자열 결합을 진행하고 결합된 문자열을 리턴하는 메소드를 구현하세요.

---

4. int 배열 한 개를 매개변수로 받아서 인덱스 역순으로 출력하는 메소드를 구현하세요.

    실행클래스의 메인메소드 아래에 static 메소드로 선언하세요.

    static의 위치는 접근제어자와 리턴타입 사이입니다.


### [Middle]

1. char 배열 한 개를 매개변수로 받아서 소문자는 대문자로, 대문자는 소문자로 변환하는데 대문자로 변환된 값은 뒤로 하나 이동한 문자를 소문자로 변환된 값는 앞으로 하나 이동한 문자를 저장한 배열을 리턴하는 메소드를 구현하세요.

    매개변수로 전달되는 char 배열에는 알파벳 대소문자만 존재합니다. 

    `{'y', 'B', 'c', 'D'}` 배열이 전달되면 `{'Z', 'a', 'D', 'c'}`가 리턴돼야 합니다. 

    그리고 만약 `z`가  입력되면 `A`가 `a`가 입력되면 `Z` 리턴돼야 합니다(알파벳 범위내에서만 이동할수 있도록). 

    실행클래스의 메인메소드 아래에 static 메소드로 선언하세요.


### [advance]
1. 가위, 바위, 보 게임을 RockScissPaper 클래스로 만드세요.
   컴퓨터가 `0(가위)`, `1(바위)`, `2(보)` 중 랜덤값을 하나 선택하고
   사용자가 가위, 바위, 보를 입력해서 사용자가 이기면 이겼습니다. 지면 졌습니다. 비기면 비겼습니다.를 출력하세요.
   사용자가 3을 입력하면 게임이 종료되면서 몇전 몇승 몇무 몇패인지 출력하세요.
```
public class RockScissPaper {

	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();

	private boolean isExit = false;

	private int gameCnt = 0;
	private int winCnt = 0;
	private int drawCnt = 0;
	private int loseCnt = 0;

	
	//게임을 시작하는 메소드
	public void start() {

	}

	//승무패 판단해주는 메소드
	public void judgeWDL(int user, int com) {

	}


	//컴퓨터 가위, 바위, 보 출력해주는 메소드
	public void printCom(int com) {

	}
}
```
### 프로그래머스 문제
+ 주사위 게임 1

  https://school.programmers.co.kr/learn/courses/30/lessons/181839
+ 주사위 게임 2

  https://school.programmers.co.kr/learn/courses/30/lessons/181930
