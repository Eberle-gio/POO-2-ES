package Jogo;

import java.util.Scanner;

public class Descoberta {
    Palavras palavras = new Palavras();
    String palavra = palavras.SelecionaPalavra();
    String palavraEmbaralhada = palavras.embaralharPalavra();
    Scanner entrada = new Scanner(System.in);
    int tentativas = 0;
    boolean acertou = false;

    void iniciaAdvinhaPalavra(){
        System.out.println("A palavra embaralhada é: " + palavraEmbaralhada);
        System.out.println("Tente adivinhar a palavra!");

        while (!acertou) {
            System.out.println("Informe a palavra: ");
            System.out.println("'dica' para uma dica ou 0 para sair");
            String chute = entrada.nextLine();

            if (chute.equals("0")) {
                System.out.println("Você desistiu do jogo" + tentativas);
                break;
            }

            if (chute.equals("dica")) {
                System.out.println("A primeira letra é:" +palavra.charAt(0) + "'" + "e a última é:"
                        + palavra.charAt(palavra.length() - 1));
                continue;
            }

            if (chute.equals(palavra)) {
                tentativas++;
                System.out.println("Você acertou a palavra em " + tentativas + " tentativas");
                acertou = true;
                break;
            } else {
                System.out.println("Palavra incorreta! Tente novamente.");
                tentativas++;
            }
        }
    }
}
