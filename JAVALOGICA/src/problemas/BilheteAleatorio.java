package problemas;


class BilheteAleatorio{
	
	public static void main(String[] args) {
		
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		System.out.printf("Sorteando no intervalo de %1$s\n",(a>b)?""+b+" a "+a:""+a+" a "+b);
		for(int i = 0; i<10; i++) {
			int numero;
			numero = aleatorio(a,b);
			System.out.println("número da rodada:"+numero);
		}
	}
	public static int aleatorio(int i, int j) {
		
		if(i>j) {
			int a=j;
			j=i;
			i=a;
		}				
		int a = (int)(Math.random() * (j-i+1));
		int c = a+i;
		return c;
	}
	
	
}