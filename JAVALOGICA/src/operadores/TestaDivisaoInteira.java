package operadores;


class TestaDivisaoInteira {

    public static void main(String[] args) {

        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        System.out.printf("\na=%1$d,b=%2$d\n", a, b);

        System.out.printf(
                "\na/b=%1$d \n(double)a/b=%2$f  \na/(double)b=%3$f \n(double)a/(double)b=%4$f \n(double)a/2=%5$f\n\n",
                a / b, (double) a / b, a / (double) b, (double) a / (double) b, (double) (a / 2));

    }
}