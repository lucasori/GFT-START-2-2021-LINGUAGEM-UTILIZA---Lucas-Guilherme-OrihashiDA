package conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public void rendimentoMensal(){
        System.out.println("Rendimento mensal: " + this.getSaldo() * 0.05);
    }
}
