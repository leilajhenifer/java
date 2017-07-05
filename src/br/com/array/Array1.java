package br.com.array;

/**
 * Estudo do Array - exemplo 1 - Array simples
 * @author Leila Jhenifer
 * https://github.com/account/unverified-email
 */
public class Array1 {
    public static void main(String[] args) {
        //Sem array
        System.out.println("Array Simples");
        System.out.println("1. Sem array");
        String time1="Palmeiras";
        String time2="Corinthians";
        String time3="São Paulo";
        String time4="Santos";
        System.out.println("Time: " + time2);
        System.out.println("2. Com array");
        //a linha abaixo cria uma array simples de tamanho 4.
        String[] times={"Palmeiras", "Corinthians", "São Paulo", "Santos"};
        //a linha abaixo exibe o conteúdo no array.
        //[0][1][2][3].
        System.out.println("Time: " + times[1]);
        //na linha abaixo o .length exibe o tamanho do array.
        System.out.println("Tamanho do array: " + times.length);
        // a linha abaixo altera o conteúdo de um array.
        times[1]= "Flamengo";
        System.out.println("Time: " + times[1]);
    }
}
