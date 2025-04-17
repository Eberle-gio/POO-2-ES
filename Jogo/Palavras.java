package Jogo;

import java.util.Random;

public class Palavras {

    private String palavra[] = { "João", "Brayan", "Giovana", "Alefe" };

    Random random = new Random();

    public String SelecionaPalavra() {
        return palavra[random.nextInt(palavra.length)];

    }

    public Palavras(){
        
    }
    String embaralharPalavra() {
        char[] palavraarray = SelecionaPalavra().toCharArray();
        Random random = new Random();
        for (int i = 0; i < palavraarray.length; i++) {
            int indiceAleatorio = random.nextInt(palavraarray.length);
            char temp = palavraarray[i];
            palavraarray[i] = palavraarray[indiceAleatorio];
            palavraarray[indiceAleatorio] = temp;

        }
        return new String(palavraarray);
    }
}
