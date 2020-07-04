package array;


class Tabuada {

    public static void main(String[] args) {

        int[][] tabuada = new int[10][10];

        for (int i = 0; i < tabuada.length; i++) {
            System.out.println("Tabuada do " + (i + 1));
            for (int j = 0; j < tabuada[i].length; j++) {
                tabuada[i][j] = (i + 1) * (j + 1);
                System.out.println((i + 1) + "x" + (j + 1) + "=" + tabuada[i][j]);
            }
            System.out.println("\n");

        }

    }
}