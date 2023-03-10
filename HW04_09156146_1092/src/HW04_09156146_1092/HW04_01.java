//資一A 09156146 張庭禎
package HW04_09156146_1092;
import java.util.*;
public class HW04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(1122, 20000);//將id,balance數值傳入class
		a.setAnnualInterestRate(0.045);//修改annualInterestRate的數值
		a.withdraw(2500);//balance-2500
		a.deposit(3000);//balance+3000
		System.out.println("Balance is "+a.getBalance());
		System.out.println("Monthly interest is "+a.getMonthlyInterest());
		System.out.println("This account was created at "+a.getDate().toString());//將日期以String印出
	}
}

class Account{
	//data field
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;//Assume that all accounts have the same interest rate.
	private Date dateCreated = new Date();
	//constructors
	Account(){
	}
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	//accessor methods
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	//mutator methods
	public void setId(int newId) {
		id = newId;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	//accessor methods
	public Date getDate() {
		return dateCreated;
	}
	//methods
	double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();
	}
	void withdraw(double amount) {
		balance -= amount;
	}
	void deposit(double amount) {
		balance += amount;
	}
}