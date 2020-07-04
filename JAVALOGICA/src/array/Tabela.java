package array;


class Tabela {

    public static void main(String[] args) {
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.println("array[" + i + "][" + j + "]=" + array[i][j]);

            }
        }
    }
}