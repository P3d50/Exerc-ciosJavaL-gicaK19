package operadores;



class TestaNegacao {

    public static void main(String[] arg) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        System.out.printf("\na=%1$d, b=%2$d \n!(a<b)=%3$s \n", a, b, !(a < b));
    }
}