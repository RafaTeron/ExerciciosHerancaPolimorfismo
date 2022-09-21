package entities5;

import java.util.List;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, List<Product> products, Double customsFee) {
		super(name, price, products);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String toString() {
		return getName() +" $ " 
	           + String.format("%.2f" ,totalPrice()) 
		       + "(Customs fee: $" + String.format("%.2f" ,(customsFee)) + " )"; 
	}

}
