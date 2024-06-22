package ch06.prblmOfcmfrm.no13;

/*13. 현실 세계의 회원을 Member클래스로 모델링하려고 합니다. 회원의 데이터로는 이름,아이디,패스워드,나이가 있습니다.
 * 이 데이터들을 가지는 member클래스를 선언해보세요.*/
public class Member {
	String name;		//이름
	String id;			//아이디
	String password;	//패스워드
	int age;			//정수
	
	/* 14. 13번 문제에서 작성한 Member클래스에 생성자를 추가하려고 합니다. 다음과 같이 name 필드와 id 필드를 외부에서
	 * 받은 값으로 초기화하도록 생성자를 선언해보세요.*/
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
}
