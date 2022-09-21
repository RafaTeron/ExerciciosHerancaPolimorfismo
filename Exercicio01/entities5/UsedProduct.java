package entities5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UsedProduct extends Product {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, List<Product> products, Date manufactureDate) {
		super(name, price, products);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return getName() +"(used)  $ " 
	           + String.format("%.2f" ,getPrice()) 
		       + "(Manufacture date: " + sdf.format(manufactureDate) + " )"; 
	}
		
	

}
