package ch06.prblmOfcmfrm.no20;

import java.util.Scanner;

/*20. 다음은 키보드로부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램입니다. 계좌는 Account객체로 생성되고 BankApplication에서 길이 100인
 * Account[] 배열로 관리됩니다. 실행 결과를 보고, Account와 BankApplication 클래스를 작성해보세요
 * (키보드로 입력받을 때는 Scanner의 nextLine() 메소드를 이용*/

public class BankApplication {
	
	//배열 생성
	private static Account[] accountArray = new Account[100];
	//Scanner 선언
	private static Scanner scanner = new Scanner(System.in);
	
	//메인 메소드
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("선택>");
			
			int selNo = Integer.parseInt(scanner.nextLine());	
			
			if(selNo==1) {
				createAccount();
			}else if(selNo==2) {
				AccountList();
			}else if(selNo==3) {
				deposit();
			}else if(selNo==4) {
				withdraw();
			}else if(selNo==5) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 번호를 입력하였습니다.");
			}
		}

	}
	
	//계좌생성
	private static void createAccount() {
		System.out.println("ㅡㅡㅡㅡㅡㅡ");
		System.out.println("계좌생성");
		System.out.println("ㅡㅡㅡㅡㅡㅡ");
		
		System.out.println("계좌번호:");
		String accountNo = scanner.nextLine();
		
		System.out.println("계좌주:");
		String accountOwner = scanner.nextLine();
		
		System.out.println("초기입금액:");
		int accountBalance = Integer.parseInt(scanner.nextLine());
		
		//입력받은 정보로 객체 생성
		Account account = new Account(accountNo, accountOwner, accountBalance);
		
		//배열에 저장
		for(int idx=0; idx<accountArray.length; idx++) {
			if(accountArray[idx]==null) {
				accountArray[idx] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
			
		}
		
	}
	
	//계좌목록
	private static void AccountList() {
		System.out.println("ㅡㅡㅡㅡㅡㅡ");
		System.out.println("계좌목록");
		System.out.println("ㅡㅡㅡㅡㅡㅡ");
		
		for(int idx=0; idx<accountArray.length; idx++) {
			Account account = accountArray[idx];
			if(account != null) {
				System.out.print(account.getAccountNo()+" ");
				System.out.print(account.getAccountOwner()+" ");
				System.out.println(account.getAccountBalance());
			}
		}
	}
	
	//예금
	private static void deposit() {
		System.out.println("ㅡㅡㅡㅡㅡㅡ");
		System.out.println("예금");
		System.out.println("ㅡㅡㅡㅡㅡㅡ");
		
		System.out.print("계좌번호:");
		String accountNo = scanner.nextLine();
		System.out.print("예금액:");
		int addBalance = Integer.parseInt(scanner.nextLine());	
		
		Account account = findAccount(accountNo);
		
		if(account==null) {
			System.out.println("일치하는 계좌가 없습니다.");
			return;
		}
		
		account.setAccountBalance(account.getAccountBalance()+addBalance);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	//출금
	private static void withdraw() {
		System.out.println("ㅡㅡㅡㅡㅡㅡ");
		System.out.println("출금");
		System.out.println("ㅡㅡㅡㅡㅡㅡ");
		
		System.out.println("계좌번호:");
		String accountNo = scanner.nextLine();
		System.out.println("출금액:");
		int minusBalance = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(accountNo);
		
		if(account==null) {
			System.out.println("일치하는 계좌가 없습니다.");
			return;
		}
		
		account.setAccountBalance(account.getAccountBalance()-minusBalance);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	//일치하는 계좌 찾기
	private static Account findAccount(String accountNo) {
		Account account = null;
		
		for(int idx=0; idx<accountArray.length; idx++) {
			if(accountArray[idx]!=null) {
				String sameAccount = accountArray[idx].getAccountNo();
				
				if(sameAccount.equals(accountNo)) {
					account = accountArray[idx];
					break;
				}
				
			}
		}
		
		return account;
	}
}
