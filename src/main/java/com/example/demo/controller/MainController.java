package com.example.demo.controller;

import com.example.demo.models.Aluno;
import com.example.demo.models.TrataAlunos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/home")
public class MainController {

    @Autowired
    private TrataAlunos trataAlunos;


    @PostMapping("/cadastra")
    public Aluno cadastraAluno(@RequestBody Aluno aluno){
      trataAlunos.recebeAlunos(aluno);
      return aluno;
    }

    @GetMapping("/listaAlunos")
    public ArrayList<Aluno> mostraAlunosCadastrados(){
        return trataAlunos.mostraAlunos();
    }


    @DeleteMapping("/removeAluno/{aluno}")
    public void removeAluno(@PathVariable Aluno aluno){
        trataAlunos.removeAluno(aluno);
    }

}
