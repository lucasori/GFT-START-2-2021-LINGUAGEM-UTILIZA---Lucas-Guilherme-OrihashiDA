package mesada;

public class FilhoApronta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mesadaPagar(double mesada) {
        this.setSaldo(mesada);
    }

    public void sacarMesada(double valor){
        if (this.getSaldo() > 0 && this.saldo > valor){
            System.out.println("Você sacou: R$ " + valor );
            double saldoSacado = this.getSaldo() - (valor * 0.5);
            this.setSaldo(saldoSacado);

        }else if (this.getSaldo() < 0 || this.getSaldo() < valor){
            System.out.println("Você não possuí saldo suficiente para sacar");
        }
    }

    public void vizualizarMesada(){
        System.out.println("Saldo atual R$" + this.getSaldo());
    }
}
