package modelo.dominio;

public class Categoria {
    private Long id;
    private String nome;

    public Categoria() {
    }

    public Categoria(java.lang.Long id, java.lang.String nome) {
        this.id = id;
        this.nome = nome;
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
}
