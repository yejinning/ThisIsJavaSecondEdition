package ch06.prblmOfcmfrm.no15;

/*15. login() 메소드를 호출할 때에는 매개값으로 id와 password를 제공하고, logout()메소드는 id만 매개값으로 제공하려고 합니다.
 * 다음 조건과 예제 코드를 보고 MemberService 클래스에서 login(), logout() 메소드를 선언해보세요.
 * ① login() 메소드는 매개값 id가 "hong", 매개값 password가 "12345"일 경우에만 true로 리턴
 * ② logout() 메소드는 id + "님이 로그아웃 되었습니다"가 출력되도록 할 것*/
public class MemberService {
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다");
	}
}
