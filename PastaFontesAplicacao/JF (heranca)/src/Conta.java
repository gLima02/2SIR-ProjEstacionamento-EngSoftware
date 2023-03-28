
public class Conta {
private int numero, agencia;
private double saldo;

public Conta () {}

public Conta (int agencia, int numero, double saldo) {
	this.agencia = agencia;
	this.numero = numero;
	this.saldo = saldo;
	
}
public int getAgencia() {
	return agencia;
}
public void setAgencia(int agencia) {
	this.agencia = agencia;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public void depositar(int deposito) {
	this.saldo += deposito;
}
public void saque(int saque) {
	this.saldo -= saque;
}
public double getSaldo() {
	return this.saldo;
}
}
