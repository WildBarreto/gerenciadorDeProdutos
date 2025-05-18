package br.com.fiap.produtos.model;

import java.util.Objects;

public class Categoria {

    private Long id;
    private String nome;

    public Categoria(String nome) {
        this.setNome(nome);
    }

    public Categoria(Long id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }

    public Categoria() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Categoria setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(nome, categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
