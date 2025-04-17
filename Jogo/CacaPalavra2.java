package Jogo;
import java.util.Scanner;
import java.util.Random;

public class CacaPalavra2 {

    char[][] tabuleiro;
    Random random = new Random();
    Palavras palavra = new Palavras();
    String palavraEscolhida = palavra.SelecionaPalavra();

    void criarTabuleiro() {
        tabuleiro = new char[10][10];
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                tabuleiro[i][j] = (char) ('a' + random.nextInt(26));
            }
        }

    }

    void incluirPalavra() {
        int linha = random.nextInt(tabuleiro.length - palavraEscolhida.length());
        int coluna = random.nextInt(tabuleiro.length - palavraEscolhida.length());
        int direcao = random.nextInt(2);
        if (direcao == 0) {
            for (int i = 0; i < palavraEscolhida.length(); i++) {
                tabuleiro[linha][coluna + i] = palavraEscolhida.charAt(i);
            }
        } else {
            for (int i = 0; i < palavraEscolhida.length(); i++) {
                tabuleiro[linha + i][coluna] = palavraEscolhida.charAt(i);
            }
        }

    }
    void inciarTabuleiro(){
        criarTabuleiro();
        incluirPalavra();
        Scanner scanner = new Scanner(System.in);
        while(true){

            Imprimir.imprimeMatriz(tabuleiro);
            System.out.println("Digite a palavra: ");
            String tentativa = scanner.nextLine();
            if(tentativa.equals(palavraEscolhida)){
                System.out.println("Parabens, você acertou a palavra: " + palavraEscolhida);
                break;
            }

            else{
                System.out.println("Palavra errada, tente novamente!");
            }
        }
    }
}
