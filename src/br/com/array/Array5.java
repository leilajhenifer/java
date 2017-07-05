package br.com.array;

/**
 * Estudo do Array - exemplo 5 - Percorrendo um array com o laço for e foreach.
 * @author Leila Jhenifer
 * https://github.com/account/unverified-email
 */
public class Array5 {
    public static void main(String[] args) {
        //iniciando um array de tamanho variável.
        int[] pares = {2,4,6,8};
        //a estrutura abaixo percorre o array de 0 até o seu tamanho máximo.
        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares["+ i + "] " + pares[i]);
        }
            //usando uma estrutura simplificada do laço for(foreach) para percorrer o array.
            System.out.println("Udo do foreach: ");
            for (int i : pares) {
                System.out.println(i);
            }
    }
}

