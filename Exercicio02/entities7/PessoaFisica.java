package entities7;

public class PessoaFisica extends Contribuintes {

	private Double saude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name,Double rendaAnual, Double saude) {
		super(name,rendaAnual);
		this.saude = saude;
	}

	public Double getSaude() {
		return saude;
	}

	public void setSaude(Double saude) {
		this.saude = saude;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if(getRendaAnual() < 20000) {
			imposto = (getRendaAnual() * 0.15) - (getSaude() * 0.5);
		}else {
			imposto = (getRendaAnual() * 0.25) - (getSaude() * 0.5);
		}
		return imposto;
	}

	
}
