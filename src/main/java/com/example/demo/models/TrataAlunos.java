package com.example.demo.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@Service
public class TrataAlunos {

    ArrayList<Aluno> alunos = new ArrayList<>();





    public void recebeAlunos(Aluno aluno){
        alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno){
        for (int i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getNome().equals(aluno)){
                alunos.remove(alunos.get(i));
            }
        }
    }

    public void listaAlunosPorNome(){
        Collections.sort(alunos, new Comparator<Aluno>() {
            @Override
            public int compare(Aluno o1, Aluno o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
    }

    public ArrayList<Aluno> mostraAlunos(){
        listaAlunosPorNome();
        return alunos;
    }

    public Aluno encontraAlunoPorNome(Aluno aluno){
        for (int i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getNome().equals(aluno)){
                return alunos.get(i);
            }
        }
        return null;
    }
}

