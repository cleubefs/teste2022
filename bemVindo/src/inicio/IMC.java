//Programa que Calcula o IMC
// Autor: Cleube Souza Versão:1.0 data:20/05/2022 as 15:49

package inicio;

//immporta a classe Scanner para ler um input

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	declaração de variaveis
		float peso,
			  altura,
			  imc;
		//recebe os input da máquina
		
		Scanner input = new Scanner (System.in);
		System.out.println("Entre com a sua Altura");
		altura = input.nextFloat();
		
		System.out.println("Entre com a seu peso");
		peso = input.nextFloat();
		
		imc=peso/(altura*altura);
		
		if (imc >= 30)
			System.out.printf("seu IMC:%n%f \nVoce esta Obeso ", imc);
		if (imc <= 18.5)
			System.out.printf("seu IMC:%n%f \nVoce esta Subnutrido ", imc);
		if ((imc > 18.5) & (imc < 24.9) )
			System.out.printf("seu IMC:%n%f \nVoce esta Saudavel ", imc);
		if (imc > 24.9 & imc <=29.9)
			System.out.printf("seu IMC:%n%f \nVoce esta Acima do Peso ", imc);
	}

}
