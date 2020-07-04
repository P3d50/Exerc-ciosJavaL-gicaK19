package metodos;

class ConsumoCombustivel {

    public static void main(String[] args) {

        double consumo1 = consumoPorKm(1234, 100);
        double consumo2 = consumoPorKm(4321, 400);

        System.out.println("\nConsumo do carro1: " + consumo1 + " litros por km\n");
        System.out.println("\nConsumo do carro2: " + consumo2 + " litros por km\n");

    }

    static double consumoPorKm(double km, double combustivel) {

        double consumo = km / combustivel;
        return consumo;

    }

}