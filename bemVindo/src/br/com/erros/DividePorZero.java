package br.com.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	private static Scanner recebe;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continuar=true;
		
		do {
		try {
			
			recebe = new Scanner(System.in);
			System.out.println ("Numero: ");
			int a = recebe.nextInt();
			
			System.out.println("Divisor: ");
			int b = recebe.nextInt();
			
			System.out.println(a/b);
			
			continuar= false;
		}
		catch (InputMismatchException e1) {
			System.err.println ("Favor inserir Numero inteiro: ");
			recebe.nextLine();
		}
		catch (Throwable e2) {
			System.err.println ("Divisor tem que ser diferente de zero");
			recebe.nextLine();
		}
		finally {
			System.out.println ("Finally executando");
			
		} 
		} while (continuar);
		
		
	}

}
