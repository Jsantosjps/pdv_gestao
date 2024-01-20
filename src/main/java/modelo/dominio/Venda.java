package modelo.dominio;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Venda {

    private Long id;
    private BigDecimal totalDaVenda;
    private BigDecimal valorPago;
    private BigDecimal troco;
    private BigDecimal desconto;
    private Usuario usuario;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime ultimaAtualizacao;

    public Venda() {
    }

    public Venda(java.lang.Long id, BigDecimal totalDaVenda, BigDecimal valorPago, BigDecimal troco, BigDecimal desconto, Usuario usuario, LocalDateTime dataHoraCriacao, LocalDateTime ultimaAtualizacao) {
        this.id = id;
        this.totalDaVenda = totalDaVenda;
        this.valorPago = valorPago;
        this.troco = troco;
        this.desconto = desconto;
        this.usuario = usuario;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public java.lang.Long getId() {
        return id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public BigDecimal getTotalDaVenda() {
        return totalDaVenda;
    }

    public void setTotalDaVenda(BigDecimal totalDaVenda) {
        this.totalDaVenda = totalDaVenda;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
}
