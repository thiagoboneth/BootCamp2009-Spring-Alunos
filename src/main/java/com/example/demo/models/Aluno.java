package com.example.demo.models;


import java.util.List;

public class Aluno {

    private String nome;
    private String endereco;
    private Integer idade;
    private List<Disciplina> materiasLista;



    public Aluno() {
    }

    public Aluno(String nome, String endereco, Integer idade, List<Disciplina> materiasLista) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.materiasLista = materiasLista;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", idade=" + idade +
                '}';
    }
}
