package com.example.demo.model;

public class dataModel {
    private String nome;
    private int duracao;
    private String area;

    public dataModel(int duracao, String nome, String area) {
        this.duracao = duracao;
        this.nome = nome;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
