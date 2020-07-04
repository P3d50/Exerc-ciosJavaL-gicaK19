package operadores;



class TestaTernario {

    public static void main(String[] arg) {

        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        System.out.printf("\n(a=%1$d),(b=%2$d)\n\n a é %3$s que b\n\n", a, b, a > b ? "maior" : "menor");

    }
}