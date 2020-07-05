package operadores;

class UseOperadoresAritmeticos {

	
	/*
	 * Na pasta operadores, crie uma classe Java chamada UseOperadoresAritmeticos. Complete o

		código a seguir com os operadores aritméticos: +, -, *, / e %. O programa deve exibir os números 11,
		4, 12, 4 e 1 nessa ordem.
		int x = 3 8;

		int y = 7 3;

		int z = 4 3;

		int q = 8 2;

		int w = 9 4;
	 */
	
	public static void main ( String [] args ) {
	
		int x = 3+8;
		int y = 7-3;
		int z = 4*3;
		int q = 8/2;
		int w = 9%4;
		
		System.out.printf("3+8=%d,7-3=%d,4*3=%d,8/2=%d,resto de 9/4=%d",x,y,z,q,w);
	}

}