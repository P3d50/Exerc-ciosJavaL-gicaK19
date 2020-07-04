package problemas;


class MaiorMenorInArray {

    public static void main(String[] args) {

    	double[] a =  { 1, 4, 4, 6, 4, 7, 8, 9, 1, 2, 3, 5 };
        int maior = MaiorMenorInArray.maior(a);

        System.out.printf("maior valor:%1$.00f no indice:%2$d",a[maior],maior);
    }

    public static int maior(double[] array){


        int indiceMaior = 0;

        for(int a = 0;a<array.length;a++){

            if(array[indiceMaior]< array[a]){
            	indiceMaior = a;
            }
        }

        return indiceMaior;

    }

}