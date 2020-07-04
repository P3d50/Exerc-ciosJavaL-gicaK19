package controleDeFluxo;



class ComparaValores {

    public static void main(String[] arg) {

        double primeiro = Math.random() * 100;
        double segundo = Math.random() * 100;

        if (primeiro > segundo) {
            System.out.printf("\nprimeiro:%1$.00f é maior que segundo:%2$.00f\n\n", primeiro, segundo);
        } else {
            System.out.printf("\nsegundo:%1$.00f é maior que o primeiro:%2$.00f\n\n", segundo, primeiro);
        }
    }
}