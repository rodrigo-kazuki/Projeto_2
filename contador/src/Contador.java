import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = entrada.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = entrada.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (Exception ParametrosInvalidosException) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
	static String contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois <= parametroUm) {
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o numero " + i);
			}
			return null;

	}
}