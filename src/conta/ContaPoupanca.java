package conta;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public void rendimentoMensal(){
        System.out.println("Rendimento mensal: " + this.getSaldo() * 0.07);
    }
}
