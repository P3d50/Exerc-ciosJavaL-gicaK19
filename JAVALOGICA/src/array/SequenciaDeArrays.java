package array;


class SequenciaDeArrays {

    public static void main(String[] args) {

        int arrayRange = (int) (Math.random() * 10);

        double[] array = new double[arrayRange];

        System.out.printf("\nArray com %1$d %2$s \n", arrayRange, arrayRange > 0 ? "posições" : "posições, encerrando");

        for (int count = 0; count < array.length; count++) {

            array[count] = (int) (Math.random() * 100);

            System.out.printf("\n Índice[%1$d], valor contido: %2$.00f \n", count, array[count]);
        }

    }
}