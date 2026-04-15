package piraozada.enums;



import java.math.BigDecimal;



public enum Tamanho {

    P(new BigDecimal("10.00")),
    M(new BigDecimal("12.00")),
    G(new BigDecimal("15.00"));


    private final BigDecimal preco;

    Tamanho(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}