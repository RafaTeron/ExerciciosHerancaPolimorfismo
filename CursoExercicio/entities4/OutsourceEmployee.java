package entities4;

import java.util.List;

public class OutsourceEmployee extends Employee {
	
	private Double additionalCharge;
	
	public OutsourceEmployee() {
		super();
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, List<Employee> employees,
			Double additionalCharge) {
		super(name, hours, valuePerHour, employees);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

	@Override
	public String toString() {
		return getName() + " - $ " + String.format("%.2f",payment()); 
	}
	
	

}
