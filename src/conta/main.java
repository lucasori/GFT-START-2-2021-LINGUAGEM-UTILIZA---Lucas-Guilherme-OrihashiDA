package conta;

public class main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("10", "Lucas", 800);
        ContaPoupanca contaPoupanca = new ContaPoupanca("8", "Luan", 1000);

        contaCorrente.rendimentoMensal();
        contaPoupanca.rendimentoMensal();

    }
}
