import java.util.Scanner;

public class SubString { 
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite seu nome completo:"); 
		String nome = leitor.next(); 
		if (nome.length() >=4 && 
			nome.substring(0, 4).equalsIgnoreCase("Joao")) { 
			System.out.println("Olá João!"); 
		} else { 
			System.out.println("Epa, você não é João!"); 
		} 
	} 
}
//OBS: Testei Joao sem acento pois o programa não rechonheceu com acento ã
