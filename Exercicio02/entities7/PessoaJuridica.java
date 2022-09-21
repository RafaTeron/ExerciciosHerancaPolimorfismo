package entities7;

public class PessoaJuridica extends Contribuintes {
	
	private Integer numeroFunc;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFunc) {
		super(name, rendaAnual);
		this.numeroFunc = numeroFunc;
	}

	public Integer getNumeroFunc() {
		return numeroFunc;
	}
	
	public void setNumeroFunc(Integer numeroFunc) {
		this.numeroFunc = numeroFunc;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if (getNumeroFunc() <= 10) {
			imposto = getRendaAnual() * 0.16;
		}else {
			imposto = getRendaAnual() * 0.14;
		}
		return imposto;
	}
	
	

}
