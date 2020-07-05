package operadores;

public class IdadeMedia {
	
	/*
	 * Utilizando os operadores aritméticos, crie um programa em Java que mostre a idade média de
	 *	três pessoas: Rafael Cosentino = 27; Jonas Hirata = 29; Marcelo Martins = 27.
	 */
	
	public static void main(String arg[]) {
		int[] idades = {27,29,27};
		double idadeMedia = idadeMedia(idades);
		System.out.printf("Idade média de Rafael Cosentino = 27; Jonas Hirata = 29; Marcelo Martins = 27:%f",idadeMedia);
		
	}
	
	public static double idadeMedia(int[] idades) {
		
		int count = 0;
		int total = 0;
		
		for(int idade:idades) {
			count++;
			total+=idade;
			
		}
		
		return total/count;
		
	}

}
