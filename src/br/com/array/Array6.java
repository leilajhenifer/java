package br.com.array;

/**
 * Estudo do Array - exemplo 6 - Array Multidimencional.
 * @author Leila Jhenifer
 * https://github.com/account/unverified-email
 */
public class Array6 {
    public static void main(String[] args) {
        //a linha abixo cria um array de 2 dimensões.
        String[][] agenda = {{"Bill","1111-1111","bill@outlook.com"},{"Linus","2222-2222","linus@tux.com"},{"Steve","3333-3333","steve@icloud.com"}};
        //exemplo 1: recuperando o email do Bill.
        //System.out.println(agenda[0][2]);
        //exemplo 2: montando a agenda de contatos.
        //o primeiro laço percorre as linhas.
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("_____________________________");
            //o segundo laço dentro do primeiro laço, percorre as colunas, montando a agenda.
            for (int j = 0; j < agenda.length; j++) {
                System.out.println(agenda[i][j]);
            }
        }
    }
}
