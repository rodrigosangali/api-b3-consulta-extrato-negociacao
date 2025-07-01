package sangali.com.api_b3_consulta_extrato_negociacao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.Getter;


import java.math.BigDecimal;
import java.time.LocalDate;


@Table(name = "extrato_negociacao")
@Entity(name = "ExtratoNegociacao")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "hashNegociacao")
@Builder
public class ExtratoNegociacao {

    @Id
    private String hashNegociacao;

    @Column(name = "data_negociacao")
    private LocalDate dataNegociacao;

    @Column(name = "tipo_movimentacao")
    private String tipoMovimentacao;

    @Column(name = "cod_produto")
    private String codProduto;

    @Column(name = "instituicao")
    private String instituicao;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "preco_unitario")
    private BigDecimal precoUnitario;

    @Column(name = "valor_operacao")
    private BigDecimal valorOperacao;

    public String getHashNegociacao() {
        return hashNegociacao;
    }

    public LocalDate getDataNegociacao() {
        return dataNegociacao;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public BigDecimal getValorOperacao() {
        return valorOperacao;
    }
}
