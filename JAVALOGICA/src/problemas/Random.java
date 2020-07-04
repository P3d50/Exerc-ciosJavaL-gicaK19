package problemas;


public class Random {
	
	public static void main(String[] args) {
		
		for(int a=0;a<10;a++) {
			int i =  (int)(Math.random()*100);
		
			System.out.println((int)i);
		}
		
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		System.out.printf("a=%1$d, b=%2$d\n", a,b);
		int intervalo = intervalo(b,a);
		System.out.printf("numero de elementos no intervalo entre %1$s :%2$d",(a>b)?""+b+" e "+a : ""+a+" e "+b,intervalo);
	}
	
	static int intervalo(int a, int b) {
				
			int intervalo;
		
			if(a<b)
				intervalo = a-(b+1);
			else
				intervalo = b-(a+1);
			return -intervalo;
	}

}
