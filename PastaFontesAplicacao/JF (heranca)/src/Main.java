
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente ();
		cc.setAgencia(103);
		cc.setNumero(222);
		cc.setTipo("PF");
		cc.setChequeEspecial(100.0);
		cc.depositar(1000);
		cc.saque(100);
		System.out.println(cc.getSaldo());
	}

}
