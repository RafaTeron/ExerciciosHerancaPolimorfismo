package entities7;

public abstract class Contribuintes {
	
	private String name;
	private Double rendaAnual;
	
	public Contribuintes() {		
	}

	public Contribuintes(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return name + ": $" + String.format("%.2f", imposto());
	}

	public abstract double imposto();

}
