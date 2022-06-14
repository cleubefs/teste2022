package br.com.meuprojeto;

public class matematicateste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		matematica m = new matematica();
		int maior = m.maior(20, 30);
		System.out.println (maior);
		
		
		matematica soma= new matematica();
		double r= soma.soma(20, 30);
		System.out.println(r);
		
		matematica divisao= new matematica();
		double d= divisao.divisao(20, 30);
		System.out.println(d);
		
	}

}
