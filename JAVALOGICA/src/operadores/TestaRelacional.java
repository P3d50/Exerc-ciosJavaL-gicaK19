package operadores;



class TestaRelacionais {

    public static void main(String[] args) {

        int a = (int) (Math.random() * 100);
        ;
        int b = (int) (Math.random() * 100);
        ;

        System.out.printf(
                "\na=%1$s, b=%2$s\n \n(a>b)=%3$s \n(a>=b)=%4$s  \n(a<b)=%5$s \n(a<=b)%6$s \n(a==b)%7$s \n(a!=b)=%8$s\n\n",
                a, b, a > b ? "verdadeiro" : "falso", a >= b ? "verdadeiro" : "falso", a < b ? "verdadeiro" : "falso",
                a <= b ? "verdadeiro" : "falso", a == b ? "verdadeiro" : "falso", a != b ? "verdadeiro" : "falso");

    }
}