package ch06.prblmOfcmfrm.no18;

public class ShopService {
	//private 접근 권한을 갖는 필드 선언과 초기화
	private static ShopService singleton = new ShopService();
	
	//private 접근 권한을 갖는 생성자 선언
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
		return singleton;
	}
}
