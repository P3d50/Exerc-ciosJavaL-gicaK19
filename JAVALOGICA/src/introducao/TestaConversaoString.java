package introducao;



class TestaConversao{

	public static void main(String[] arg){

		String s ="19.09";

		double d = Double.parseDouble(s);

		System.out.printf("\nString %s",s);

		System.out.printf("\nconversão para double %f",d);		
		System.out.println("\nconversão para double sem máscara de formatação"+d);
	}
}