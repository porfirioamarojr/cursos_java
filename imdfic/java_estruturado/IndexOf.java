import java.util.Scanner;

public class IndexOf {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String nome1 = leitor.next();
		char ponto = '.';
		System.out.println("A posição do ponto no texto é: " 
		+ nome1.indexOf(ponto));
	}
}
