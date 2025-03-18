package com.teste.first_project.model;

public class Produto {


    private Integer id; 

    private String nome;

    private Integer quantidade;

    private Double valor;
    
    private String observacao;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservação() {
        return observacao;
    }

    public void setObservação(String observacao) {
        this.observacao = observacao;
    }

    
}
