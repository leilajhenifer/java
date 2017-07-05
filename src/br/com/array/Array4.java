package br.com.array;

/**
 * Estudo do Array - exemplo 4 - Preenchendo um array com o laço for.
 * @author Leila Jhenifer
 * https://github.com/account/unverified-email
 */
public class Array4 {
    public static void main(String[] args) {
        int[] idades = new int[10];
        //a estrutura abaixo cria as variáveis que irão preencher as 10 posições ("casinhas") do array.
        for (int i = 0; i < 10; i++) {
            idades[i] = i*10;
            System.out.println("Idades[" + i + "] = " + idades[i]);
        }
            
    }
}
