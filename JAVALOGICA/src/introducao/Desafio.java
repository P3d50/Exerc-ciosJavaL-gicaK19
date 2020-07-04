package introducao;

class Desafio {
	
	public static void main(String args[]){
		
		imprimeNome();
		imprimeASC2Char(1200);
	}
	//desafio1
	//desta forma esta imprimindo de uma forma que as letras ficam certas na execução do método, tem que ficar
	//desse jeito no código por causa do escape que esta sendo usado para desenhar as letras
	public static void imprimeNome() {
		System.out.println(" ________     ________    ________      _________     __________ " );
		System.out.println("|   __  \\    |  ______|  |  ____  \\    |  ______ \\    /  _______ \\");
		System.out.println("|  |  |  |   |  |        |  |   \\  |   |  |     \\ |  |  |      | |");
		System.out.println("|   --   /   |  ------   |  |    | |   |  |_____/ /  |  |      | |");
		System.out.println("|  -----     |  ______|  |  |    | |   |      ___/   |  |      | |");
		System.out.println("|  |         |  |        |  |    / |   |     \\       |  |______| |");
		System.out.println("|  |         |  ------|  |  |__ /  /   |   _  \\      |           |");
		System.out.println("|__|         |________|  |________/    |__| |__\\      \\_________/" );
	}
	//desafio2
	//adicionando asc2
	public static void imprimeASC2Char(int end) {
		int coluna = 0;
		for(int i = 0; i<= end;i++) {
			coluna++;
			System.out.print((char)i+",");
			if(coluna == 50) {
				coluna = 0;
				System.out.println("");
			}
		}
	}
}	
