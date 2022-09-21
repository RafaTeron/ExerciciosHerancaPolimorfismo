package Aula3;

import entities3.Account3;
import entities3.SavingsAccount3;

public class Program3 {

	public static void main(String[] args) {

		Account3 x = new Account3(1020, "Alex", 1000.0);
		Account3 y = new SavingsAccount3(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
}