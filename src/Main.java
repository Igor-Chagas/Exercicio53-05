import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int fatN;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do numero para o qual deseja-se calcular o seu Fatorial:");
		int n = sc.nextInt();
		
		if (n == 0) {
			System.out.println("1");
		}
		else {
		fatN = n;
		for (int i=1; i < n; i++) {
		fatN *= (n - i);
		}
		System.out.println(fatN);
		}
		sc.close();
	}

}
