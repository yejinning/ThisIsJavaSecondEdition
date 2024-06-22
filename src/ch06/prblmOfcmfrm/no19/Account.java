package ch06.prblmOfcmfrm.no19;

/* 19. 은행 계좌 객체인 Account 객체는 잔고(balacne) 필드를 가지고 있습니다. balacne 필드는 음수값이 될 수 없고, 최대 백만 원까지만
 *  저장할 수 있습니다. 외부에서 balacne 필드를 마음대로 변경하지 못하도록 하고, 0 <= balacne <= 1,000,000 범위의 값만 가질 수 있도록
 *  Account 클래스를 작성해보세요.
 *  ① Setter와 Getter를 이용
 *  ② 0과 1,000,000은 MIN_BALANCE와 MAX_BALANCE 상수를 선언해서 이용
 *  ③ Setter의 매개값이 음수이거나 백만 원을 초과하면 현재 balance 값을 유지
 * */
public class Account {
	private int balance;
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
			//return문은 메소드의 실행을 강제 종료하고 호출한 곳으로 돌아간다는 의미
		}
		this.balance = balance;
	}

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
	}

}
