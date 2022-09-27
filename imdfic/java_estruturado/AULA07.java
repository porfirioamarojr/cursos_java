import java.util.Scanner;

public class AULA07 {

    public static void main(String args[]){

        Scanner leitor = new Scanner(System.in);

        String palavra=leitor.next();

        int inicio=0;

        int posicao=palavra.indexOf('a');

        while(inicio<palavra.length() && posicao!=-1){

            System.out.print(posicao+" ");

            inicio=posicao+1;

            posicao=palavra.indexOf('a',inicio);

        }

    }  

}