package papainoel;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int boazinha = 0;
        int malvada = 0;
        int numeroCrianca = 0;
        int cont = 0;

        Scanner s = new Scanner(System.in);

        Crianca crianca = new Crianca();

        System.out.println("Para quantas criança deseja perguntar: ");
        numeroCrianca = s.nextInt();

        while(cont < numeroCrianca) {
            cont++;

            System.out.println("Qual seu nome minha criança? ");
            crianca.setNome(s.next());

            System.out.println("Você foi uma criança boazinha ou malvada? ");
            crianca.setPersonalidade(s.next().toLowerCase());

            if (crianca.getPersonalidade().equals("boazinha")) {
                System.out.println(crianca.getNome() + " recebeu presente");
                boazinha++;
            } else if (crianca.getPersonalidade().equals("malvada")) {
                System.out.println(crianca.getNome() + " não recebeu presente");
                malvada++;
            }
        }

        System.out.println("Quantidade de criança que recebeu presente: " + boazinha);
        System.out.println("Quantidade de criança que não recebeu presente: " + malvada);
    }
}
