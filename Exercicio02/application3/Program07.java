package application3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities7.Contribuintes;
import entities7.PessoaFisica;
import entities7.PessoaJuridica;

public class Program07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		List<Contribuintes> list = new ArrayList<>();
		
		for(int i=1; i<=N; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (j/f)? ");
			String company = sc.next();
			System.out.print("Name: ");
			String nome = sc.next();
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();
			if(company.equals("f")) {
				System.out.print("Health expenditures: ");
				double saude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual,saude));
			}
			if(company.equals("j")) {
				System.out.print("Number of employees: ");
				int numeroFunc = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual,numeroFunc));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
	    double soma = 0;
		for(Contribuintes x : list) {
			double imposto = x.imposto();
			System.out.println(x);
			soma += imposto;
		}
		
		System.out.println();
		System.out.printf("Total imposto : %.2f%n", soma);
		sc.close();
	}

}
