import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de valores a digitar:");
		int a;
		int[] valores = new int[a = leitor.nextInt()];
		System.out.println("Digite agora os valores:");
		for (int i = 0; i < a; i++) {
			valores[i] = leitor.nextInt();
		}
		System.out.println("Valores digitados:");
		for (int i = 0; i < a; i++) {
			System.out.println(valores[i]);
		}
	}
}

/*O código iria levantar uma exceção caso o número digitado pelo usuário fosse menor que 10.
O indice 10 foi substituido como um teste pela variavel inteira a */