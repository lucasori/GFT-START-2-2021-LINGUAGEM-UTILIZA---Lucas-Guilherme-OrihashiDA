package futebol;

import java.util.Calendar;

public class JogadorFutebol {

    private String nome;
    private String posicao;
    private String dataNascimento;

    Calendar cal = Calendar.getInstance();

    public JogadorFutebol(String nome, String posicao, String dataNascimento) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void calcularIdade(int anoNascimento){
        int year = cal.get(Calendar.YEAR);
        System.out.println(year - anoNascimento + " anos");
    }

    public void tempoQueFaltaParaAposentar(int idade){
        if (this.getPosicao().equalsIgnoreCase("defesa")) {
            System.out.println("Falta: " + (40 - idade) + " anos");
        }else if (this.getPosicao().equalsIgnoreCase("meio-campo")) {
            System.out.println("Falta: " + (38 - idade) + " anos");
        }else if (this.getPosicao().equalsIgnoreCase("atacante")) {
            System.out.println("Falta: " + (35 - idade) + " anos");
        }else if (idade == 35){
            System.out.println("Pode se aposentar atacante");
        }else if (idade == 38){
            System.out.println("Pode se aposentar meio-campo");
        }else if (idade > 40){
            System.out.println("Pode se aposentar defesa");
        }
    }

    public void vizualizarDdos() {
        System.out.println("Jogador: " + this.getNome() + " \nPosição: " + this.getPosicao() + "\nData de nascimento: " + this.dataNascimento);
    }
}
