package entities;

public class empregadoTerceirizado extends empregados {
	
	
	private double cargaAdicional;
	
	public empregadoTerceirizado() {
		super();
	}

	public empregadoTerceirizado(String nome, int horas,double valorPorHora, double cargaAdicional) {
		super();
		this.cargaAdicional = cargaAdicional;
	}
	
	public double setCargaAdicional() {
		return cargaAdicional;
	}
	
	public void setCargaAdicional(Double cargaAdicional) {
		this.cargaAdicional = cargaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + cargaAdicional * 1.1;
	}

}
