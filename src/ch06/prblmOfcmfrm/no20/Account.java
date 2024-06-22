package ch06.prblmOfcmfrm.no20;

public class Account {
	//필드
	private String accountNo;
	private String accountOwner;
	private int accountBalance;
	
	//생성자
	public Account(String accountNo, String accountOwner, int accountBalance) {
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.accountBalance = accountBalance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
