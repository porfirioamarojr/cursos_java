import java.util.Scanner;

public class RecursiveDoubleNumber { 
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite um número a ser dobrado várias vezes:"); 
		int numero = leitor.nextInt(); 
		System.out.println("Digite um número limite para a operação:"); 
		int limite = leitor.nextInt(); 
		System.out.println(dobrarNumeroAteLimite(numero, limite)); 
	}

	public static int dobrarNumeroAteLimite(int numero, int limite) { 
		int dobro = 2 * numero; 
		if (dobro >= limite) { 
			return numero; 
		} else { 
			return dobrarNumeroAteLimite(dobro, limite); 
		} 
	} 
}
