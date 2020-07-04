package operadores;



class TestaLogicos {

    public static void main(String[] args) {

        int a = (int) (Math.random() * 100);

        int b = (int) (Math.random() * 100);

        int c = (int) (Math.random() * 100);

        int d = (int) (Math.random() * 100);

        System.out.printf(
                "\na=%1$d, b=%2$d, c=%3$d, d=%4$d \n(a > b | c < d)=%5$s \n( a > b || c < d )=%6$s \n( a > b & c < d )=%7$s \n( a > b && c < d )=%8$s  \n( a > b ^ c < d )=%9$s\n\n",
                a, b, c, d, (a > b | c < d), (a > b || c < d), (a > b & c < d), (a > b && c < d), (a > b ^ c < d));

    }
}