package com.academic.Simple.CRUD.API.shared;

import com.academic.Simple.CRUD.API.model.Produto;

public class ProdutoDTO {

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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public ProdutoDTO() {
    }

    public ProdutoDTO(String nome, Integer quantidade, Double valor, String observacao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.observacao = observacao;
    }

    public ProdutoDTO(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.quantidade = produto.getQuantidade();
        this.valor = produto.getValor();
        this.observacao = produto.getObservacao();
    }

}
