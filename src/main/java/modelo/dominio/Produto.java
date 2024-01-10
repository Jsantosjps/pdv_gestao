package modelo.dominio;
import java.math.BigDecimal;
import java.time.LocalDateTime;
public class Produto {
    private Long id;
    private String nome;
    private BigDecimal preco;
    private Integer quantidade;
    private Categoria categoria;
    private Usuario usuario;
    private localDateTime dataHoraCriacao;
    public Produto() {
    }

    public Produto(java.lang.Long id, java.lang.String nome, BigDecimal preco, java.lang.Integer quantidade, Categoria categoria, Usuario usuario, localDateTime dataHoraCriacao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.usuario = usuario;
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public java.lang.Long getId() {
        return id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public java.lang.Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(java.lang.Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public localDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(localDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }
}
