package mesada;

public class main {

    public static void main(String[] args) {

        FilhoApronta filhoApronta = new FilhoApronta();
        FilhoNaoApronta filhoNaoApronta = new FilhoNaoApronta();

        // Filho apronta
        filhoApronta.mesadaPagar(500);
        filhoApronta.vizualizarMesada();

        filhoApronta.sacarMesada(100);
        filhoApronta.vizualizarMesada();

        filhoApronta.sacarMesada(500);
        filhoApronta.vizualizarMesada();

        System.out.println("--------------------------------------------");

        // Filho não apronta
        filhoNaoApronta.mesadaPagar(400);
        filhoNaoApronta.vizualizarMesada();

        filhoNaoApronta.sacarMesada(100);
        filhoNaoApronta.vizualizarMesada();

        filhoNaoApronta.sacarMesada(500);
        filhoNaoApronta.vizualizarMesada();

    }
}
