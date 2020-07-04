package introducao;


class TestaCasting {
	
	public static void main(String[] arg){

		long a = 2147483648L;

		int b = (int)a;


		System.out.printf("\ntype long: %d", a);
		System.out.printf("\ncasting to int: %d",b);
	}
}