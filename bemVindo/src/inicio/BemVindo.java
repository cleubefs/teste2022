package inicio;
import java.util.Scanner;
public class BemVindo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.println ("Entre com primeiro numero:");
		numero1 = input.nextInt();
		System.out.println ("Entre com segundo numero:");
		numero2 = input.nextInt();
		soma = numero1 + numero2;
		
		System.out.printf("A soma dos numeros e: %d%n", soma);
		
		if (numero1 == numero2)
			System.out.printf("%d == %d%n", numero1,numero2);
		if (numero1 != numero2)
			System.out.printf("%d != %d%n", numero1,numero2);
		if (numero1 < numero2)
			System.out.printf("%d < %d%n", numero1,numero2);
		if (numero1 > numero2)
			System.out.printf("%d > %d%n", numero1,numero2);
		if (numero1 <= numero2)
			System.out.printf("%d <= %d%n", numero1,numero2);
		if (numero1 >= numero2)
			System.out.printf("%d >= %d%n", numero1,numero2);

	}

}
