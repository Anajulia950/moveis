package model;

import enums.Comodo;
import enums.Acabamento;

public abstract class Movel {

    // ATRIBUTOS PRIVADOS
    private String nome;
    private String material;
    private double precoBase;

    private Comodo comodo;         // ENUM SIMPLES
    private Acabamento acabamento; // ENUM COMPLETO

    /**
     * Construtor da classe Movel.
     *
     * @param nome Nome do móvel
     * @param material Material do móvel
     * @param precoBase Preço base do móvel
     * @param comodo Cômodo onde o móvel será usado
     * @param acabamento Tipo de acabamento
     */
    public Movel(String nome,
                 String material,
                 double precoBase,
                 Comodo comodo,
                 Acabamento acabamento) {

        this.nome = nome;
        this.material = material;
        this.precoBase = precoBase;
        this.comodo = comodo;
        this.acabamento = acabamento;
    }

    /**
     * Método abstrato que deverá ser implementado pelas subclasses.
     * Representa a ação de montar o móvel.
     */
    public abstract void montar(); // MÉTODO ABSTRATO

    /**
     * Método concreto que exibe os dados do móvel.
     * Pode ser sobrescrito pelas subclasses.
     */
    public void exibirFicha() { // MÉTODO CONCRETO
        System.out.println("===== FICHA DO MÓVEL =====");
        System.out.println("Nome: " + nome);
        System.out.println("Material: " + material);
        System.out.println("Preço Base: R$ " + precoBase);
        System.out.println("Cômodo: " + comodo);
        System.out.println("Acabamento: " + acabamento.getDescricao());
    }

    /**
     * Método concreto que retorna o preço final do móvel.
     * Subclasses podem sobrescrever se desejarem aplicar cálculos adicionais.
     *
     * @return preço final do móvel
     */
    public double calcularPrecoFinal() { // MÉTODO CONCRETO
        return precoBase;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public Comodo getComodo() {
        return comodo;
    }

    public Acabamento getAcabamento() {
        return acabamento;
    }
}