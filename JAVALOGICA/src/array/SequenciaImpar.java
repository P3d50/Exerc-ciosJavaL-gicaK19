package array;


class SequenciaImpar {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
            System.out.println("array[" + i + "]=" + array[i]);
        }

    }
}