package entities5;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String name;
	private Double price;
	
	public List<Product> products = new ArrayList<>();
	
	public Product() {		
	}

	public Product(String name, Double price, List<Product> products) {
		this.name = name;
		this.price = price;
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Product> getProduct() {
		return products;
	}

	public void addProduct(Product product) {
		 products.add(product);
	}
	
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	public String toString() {
		return getName() +" $ " 
	           + String.format("%.2f" ,getPrice());
	}

}
