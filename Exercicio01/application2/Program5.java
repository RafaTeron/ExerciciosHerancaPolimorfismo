package application2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities5.ImportedProduct;
import entities5.Product;
import entities5.UsedProduct;

public class Program5 {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Enter the number of products: ");
		List<Product> List = new ArrayList<>();
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.println("Product #" + i +" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			String type = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if(type.equals("c")) {
				List.add(new Product(name, price, List));
			}
			if(type.equals("u")) {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufacture = sdf.parse(sc.next());
				List.add(new UsedProduct(name, price, List, manufacture));
			}
			if(type.equals("i")) {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				List.add(new ImportedProduct(name, price, List, customsFee));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		
		for (Product x : List) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
