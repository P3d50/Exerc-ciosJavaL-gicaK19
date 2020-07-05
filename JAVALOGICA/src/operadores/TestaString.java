package operadores;



class TestaString {

    public static void main(String[] args) {

        String s = "Pedro Ramos";

        System.out.println(s);

        System.out.println(s.contains("s"));
        System.out.println(s);

        System.out.println(s.contains(" "));
        System.out.println(s);

        System.out.println(s.endsWith(" Cosentino "));
        System.out.println(s);

        System.out.println(s.endsWith("Ramos"));
        System.out.println(s+"2"); 

        System.out.println(s.startsWith("P"));
        System.out.println(s);
        System.out.println(s.startsWith("e"));
        System.out.println(s);
        s = s.replaceAll("e", "3");

        System.out.println(s);
        System.out.println(s.substring(6));
        System.out.println(s);
        System.out.println(s.substring(0, 5));
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        s = s.toLowerCase();

        System.out.println(s);
        s = "K19 Treinamentos";
        System.out.println(s.trim());
        for(String str:s.split(" ")) {
        	System.out.println(str);
        }
    }
}