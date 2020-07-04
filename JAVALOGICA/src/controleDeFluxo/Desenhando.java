package controleDeFluxo;



class Desenhando {

    public static void main(String[] args) {

        for (int linha = 1; linha <= 5; linha++) {

            for (int colunas = 1; colunas <= 20; colunas++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int l = 1; l <= 5; l++) {

            for (int tamanho = 1; tamanho <= 5; tamanho++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int count = 0; count <= 5; count++) {

            for (int s = 0; s <= count; s++) {
                System.out.print(" ");
            }

            for (int colunas = 1; colunas <= 20; colunas++) {

                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}