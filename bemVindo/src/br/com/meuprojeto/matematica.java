package br.com.meuprojeto;

public class matematica {

		int maior (int um, int dois) {
			if (um > dois) {
				return um;
			}else {
				return dois;
			}
		}
		
		double soma( double um , double dois ) {
		double	resultado = um+dois;
		return resultado;
		}
		
		double divisao ( double um, double dois) {
			double divisao = dois/um;
			return divisao;
		}
}
