package operadores;


class TestaAtribuicao {

    public static void main(String[] arg) {

        int a = (int) (Math.random() * 100);

        System.out.print("a=" + a);

        System.out.printf("\n(a+=2)=%1$d  \n(a-=1)=%2$d \n(a*=3)=%3$d \n(a/=2)=%4$d \n(resto de a por 2)=%5$d \n(a=%6$d) \n(++a)=%7$d \n(--a)=%8$d\n",a += 2, a -= 1, a *= 3, a /= 2, a %= 2, a, ++a, --a);

    }
}