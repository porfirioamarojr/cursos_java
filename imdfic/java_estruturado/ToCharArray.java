import java.util.Scanner;

public class ToCharArray {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String nome1 = leitor.next();
		char[] caracteres = nome1.toCharArray();
		System.out.println("Inverso:");
		for (int i = caracteres.length - 1; i >= 0 ; i--) {
			System.out.print(caracteres[i]);
		}
	}
}
