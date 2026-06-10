package model;

import enums.Comodo;
import enums.Acabamento;

public class Cadeira extends Movel {

    // Atributos próprios da subclasse
    private boolean ehGiratoria;
    private int capacidadeKg;

    /**
     * Construtor da classe Cadeira.
     *
     * @param nome Nome do móvel
     * @param material Material do móvel
     * @param precoBase Preço base do móvel
     * @param comodo Cômodo onde será utilizado
     * @param acabamento Tipo de acabamento
     * @param ehGiratoria Indica se a cadeira é giratória
     * @param capacidadeKg Peso máximo suportado
     */
    public Cadeira(String nome,
                   String material,
                   double precoBase,
                   Comodo comodo,
                   Acabamento acabamento,
                   boolean ehGiratoria,
                   int capacidadeKg) {

        // HERANÇA - chamada ao construtor da superclasse
        super(nome, material, precoBase, comodo, acabamento);

        this.ehGiratoria = ehGiratoria;
        this.capacidadeKg = capacidadeKg;
    }

    @Override // OVERRIDE
    public void montar() {

        System.out.println(
                "A cadeira " + getNome() +
                " foi montada com sucesso."
        );
    }

    
     @param qtdPessoas quantidade de pessoas envolvidas
     
    public void montar(int qtdPessoas) { // OVERLOAD

        System.out.println(
                "A cadeira " + getNome() +
                " foi montada por " +
                qtdPessoas + " pessoa(s)."
        );
    }

    @Override // OVERRIDE
    public void exibirFicha() {

        super.exibirFicha();

        System.out.println("Giratória: " + ehGiratoria);
        System.out.println("Capacidade: " + capacidadeKg + " kg");
    }

    /**
     * Getter do atributo ehGiratoria.
     *
     * @return true se a cadeira for giratória
     */
    public boolean isEhGiratoria() {
        return ehGiratoria;
    }

    /**
     * Getter do atributo capacidadeKg.
     *
     * @return capacidade máxima suportada
     */
    public int getCapacidadeKg() {
        return capacidadeKg;
    }
}