package modelo.dominio;

import java.time.LocalDateTime;

public class Usuario {
    private Long id;
    private String nome;
    private String senha;
    private String usuario;
    private Perfil perfil;
    private boolean estado;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime ultimoLogin;

    public Usuario(java.lang.Long id) {
        this.id = id;
        this.estado = true;
    }

    public Usuario(java.lang.Long id, java.lang.String nome, java.lang.String senha, java.lang.String usuario, Perfil perfil, LocalDateTime dataHoraCriacao, LocalDateTime ultimoLogin) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.usuario = usuario;
        this.perfil = perfil;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimoLogin = ultimoLogin;
        this.estado = true;
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

    public java.lang.String getSenha() {
        return senha;
    }

    public void setSenha(java.lang.String senha) {
        this.senha = senha;
    }

    public java.lang.String getUsuario() {
        return usuario;
    }

    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Usuario usuario = (Usuario) object;

        return id.equals(usuario.id);
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }

    public void reset(){
        this.estado = true;
    }

    public void mudarEstado(){
        this.estado = !this.estado;
    }
}
