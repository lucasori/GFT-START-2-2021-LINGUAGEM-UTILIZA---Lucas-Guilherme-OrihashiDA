package futebol;

public class main {

    public static void main(String[] args) {

        JogadorFutebol jogador = new JogadorFutebol("Messi", "meio-campo", "24/06/1987");
        JogadorFutebol jogador1 = new JogadorFutebol("Pedro", "defesa", "05/06/2000");
        JogadorFutebol jogador2 = new JogadorFutebol("Lucas", "atacante", "11/05/2000");

        jogador.vizualizarDdos();
        jogador.calcularIdade(1987);
        jogador.tempoQueFaltaParaAposentar(34);


        jogador1.vizualizarDdos();
        jogador.calcularIdade(2000);
        jogador.tempoQueFaltaParaAposentar(21);

        jogador2.vizualizarDdos();
        jogador.calcularIdade(2000);
        jogador.tempoQueFaltaParaAposentar(21);

    }

}
