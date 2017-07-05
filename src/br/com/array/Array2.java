package br.com.array;

import java.util.Random;

/**
 * Estudo do Array - exemplo 2 - Sorteio de uma cartaArray simples
 * @author Leila Jhenifer
 * https://github.com/account/unverified-email
 */
public class Array2 {
    public static void main(String[] args) {
        String[] nipes={"Espadas","Paus","Copas","Ouros"};
        String[] faces={"AZ","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
        //a linha abaixo cria um objeto chamado sorteio usando como modelo a classe Random.
        Random sorteio = new Random();
        //a linha abaixo faz o sorteio do índice das faces dos nipes, usando o objeto sorteio e atribui o resultado a variável índice_nipe.
        // o número (4) gera números aleatórios no intervalo de 0 à 3.
        int indice_nipe = sorteio.nextInt(4);
        //a linha abaixo faz o sorteio do índice das faces das cartas, usando o objeto sorteio e atribui o resultado a variável índice_face.
        // o .lenght gera números aleatórios no intervalo do tamanho total do array
        int indice_face = sorteio.nextInt(faces.length);
        //as linhas abaixo atribuem o resultado do sorteio ao array correspondente.
        String face = faces[indice_face];
        String nipe = nipes[indice_nipe];
        //a linha abaixo exibe a carta sorteada.
        System.out.println(face + " de " + nipe);
    }
}
