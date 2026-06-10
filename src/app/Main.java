package app;

import model.Cadeira;
import enums.Comodo;
import enums.Acabamento;

public class Main {

    public static void main(String[] args) {

        Cadeira cadeira1 = new Cadeira(
                "Cadeira Gamer",
                "Couro Sintético",
                1200.00,
                Comodo.ESCRITORIO,
                Acabamento.LUXO,
                true,
                150
        );

        Cadeira cadeira2 = new Cadeira(
                "Cadeira de Jantar",
                "Madeira",
                450.00,
                Comodo.SALA,
                Acabamento.PREMIUM,
                false,
                120
        );

        System.out.println("==================================");
        System.out.println("DADOS DA CADEIRA 1");
        System.out.println("==================================");

        cadeira1.exibirFicha();

        System.out.println("\nTeste do método montar():");
        cadeira1.montar();

        System.out.println("\nTeste do método sobrecarregado montar(int):");
        cadeira1.montar(2);

        System.out.println("\nPreço Final: R$ " + cadeira1.calcularPrecoFinal());

        System.out.println("\n==================================");
        System.out.println("DADOS DA CADEIRA 2");
        System.out.println("==================================");

        cadeira2.exibirFicha();

        System.out.println("\nTeste do método montar():");
        cadeira2.montar();

        System.out.println("\nTeste do método sobrecarregado montar(int):");
        cadeira2.montar(1);

        System.out.println("\nPreço Final: R$ " + cadeira2.calcularPrecoFinal());

        System.out.println("\n==================================");
        System.out.println("COMPARAÇÃO ENTRE AS CADEIRAS");
        System.out.println("==================================");

        if (cadeira1.getPrecoBase() > cadeira2.getPrecoBase()) {
            System.out.println(cadeira1.getNome() +
                    " é mais cara que " +
                    cadeira2.getNome());
        } else if (cadeira2.getPrecoBase() > cadeira1.getPrecoBase()) {
            System.out.println(cadeira2.getNome() +
                    " é mais cara que " +
                    cadeira1.getNome());
        } else {
            System.out.println("As duas cadeiras possuem o mesmo preço.");
        }

        if (cadeira1.getCapacidadeKg() > cadeira2.getCapacidadeKg()) {
            System.out.println(cadeira1.getNome() +
                    " suporta mais peso.");
        } else if (cadeira2.getCapacidadeKg() > cadeira1.getCapacidadeKg()) {
            System.out.println(cadeira2.getNome() +
                    " suporta mais peso.");
        } else {
            System.out.println("As duas cadeiras possuem a mesma capacidade.");
        }
    }
}