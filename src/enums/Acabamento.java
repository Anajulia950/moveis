package enums;

public enum Acabamento {

    BASICO("A1", "Acabamento Básico"),      
    PREMIUM("A2", "Acabamento Premium"), 
    LUXO("A3", "Acabamento de Luxo");      

    private final String codigo;
    private final String descricao;


     @param codigo Código interno do acabamento
     @param descricao Descrição detalhada do acabamento
    
    Acabamento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }


     @return código do acabamento
    public String getCodigo() {
        return codigo;
    }

     @return descrição detalhada do acabamento
    public String getDescricao() {
        return descricao;
    }
}