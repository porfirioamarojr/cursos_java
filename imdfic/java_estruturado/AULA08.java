import java.util.Scanner;
public class AULA08 {

    public static void main(String args[]){

        Scanner leitor=new Scanner(System.in);

        double numero=0;

        while(digita(numero)){

            System.out.println("Digite um numero");

            numero=leitor.nextDouble();

        }

        System.out.println("Saindo :p");

    }

    public static boolean digita(double n){

        if(n==-1){

            return false;

        }

        return true;

    }

}