package com.example.demo.models;


public class Disciplina {

    private String disciplina;
    private Integer nota;

    public Disciplina(String disciplina, Integer nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public Disciplina() {
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "AlunoMateria{" +
                "disciplina='" + disciplina + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }
}
