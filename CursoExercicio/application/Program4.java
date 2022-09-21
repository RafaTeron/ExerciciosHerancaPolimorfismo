package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities4.Employee;
import entities4.OutsourceEmployee;

public class Program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employee> List = new ArrayList<>();

		System.out.print("Enter the number of employees:");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			String outsourced = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if (outsourced.equals("y")) {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourceEmployee(name, hours, valuePerHour, List, additionalCharge);
				List.add(emp);
			}
			if (outsourced.equals("n")) {
				Employee emp = new Employee(name, hours, valuePerHour, List);
				List.add(emp);
			}

		}

		System.out.println();
		System.out.println("Payments : ");

		for (Employee x : List) {
			System.out.println(x);
		}

		sc.close();

	}

}
