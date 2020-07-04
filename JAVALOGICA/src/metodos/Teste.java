package metodos;
class Teste {

    public static void main(String[] args) {

        double a = teste(3, 5);

        System.out.println("int to double:" + a);

        String b = str(54, 6);

        System.out.println("int to String:" + b);

    }

    static double teste(int a, int b) {
        return a + b;
    }

    static String str(int a, int b) {
        return "" + a + b;
    }
}