package entities3;

//Adicionar um "final" antes da classe para evitar Sobreposiçoes da classe
public class SavingsAccount3 extends Account3 {
   
	
	
	private Double interestRate;
	
	public SavingsAccount3() {
		super();
	}

	public SavingsAccount3(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override//Adicionar um "final" antes do void para evitar inconsistências do método
	public void withdraw(double amount) {
		balance -= amount;
	}
}