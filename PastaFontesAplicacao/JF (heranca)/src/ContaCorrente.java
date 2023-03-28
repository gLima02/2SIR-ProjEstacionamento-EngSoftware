
public class ContaCorrente extends Conta {
	private String tipo;
	private Double chequeEspecial;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	public double getSaldoDisponivel() {
		return super.getSaldo() + chequeEspecial;
	}
	
	@Override
	public void saque(int valor) {
		valor += 10;
		super.saque(valor);
		//sobrescrita de método;
	}
	
}
