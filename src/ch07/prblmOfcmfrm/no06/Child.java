package ch07.prblmOfcmfrm.no06;

/*06. Parent 클래스를 상속해서 Child클래스를 다음과 같이 작성했는데, Child 생성자에서 컴파일 에러가 발생했습니다. 그 이유와 해결 방법을 설명해보세요.
 * 내 답변 : 자식클래스는 생성자에서 super()를 호출하여, 부모클래스의 기본 생성자를 실행해야 하는데 super()를 호출하지 않았다.
 * 모든 객체는 생성자를 호출해야만 생성된다. 부모 생성자는 자식 생성자의 맨 첫 줄에 숨겨져 있는 super()에 의해 호출된다.
 * super()는 컴파일 과정에서 자동 추가되는데, 이것은 부모의 기본 생성자를 호출한다. 만약 부모 클래스에 기본 생성자가 없다면 자식 생성자 선언에서 
 * 컴파일 에러가 발생한다. 부모 클래스에 기본 생성자가 없고 매개변수를 갖는 생서자만 있다면 개발자는 다음과 같이 super(매가값)코드를 직접 넣어야 한다.
 * 이 코드는 매개값의 타입과 개수가 일치하는 부모 생성자를 호출한다.*/
public class Child extends Parent{
	public int studentNo;
	
	public Child(String name, int studentNo) {
		/* 정답 : 부모 생성자를 올바르게 호출하지 않았다.this.name = name; 라인을 지우고 super(name); 코드를 넣는다.*/
		super(name);
//		this.name = name;
		this.studentNo = studentNo;
	}
}
