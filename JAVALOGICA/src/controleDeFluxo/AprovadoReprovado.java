package controleDeFluxo;


class AprovadoReprovado {

    public static void main(String[] arg) {

        double nota = Math.random() * 10;

        // System.out.printf("\na nota foi:%1$.00f, aluno %2$s\n\n", nota, nota >=
        // 6"aprovado" : "reprovado");

        if (!(nota >= 6)) {

            System.out.printf("\n Nota:%1$.00f, aluno %2$s",
             nota,
              "reprovado\n\n");
        } else {
            System.out.printf("\n Nota:%1$.00f, aluno %2$s", nota, "aprovado\n\n");
        }

    }
}