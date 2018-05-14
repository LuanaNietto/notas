/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno.objeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class Aluno {
    
    private String nome;
    private int matricula;
    private List<Nota> nota;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        nota = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Nota> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Nota> nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + '}';
    }
public double calcularMedia(){
float soma = 0;
for(Nota nota : nota){
    soma += nota.getNota();
}
   return soma/nota.size();
    }
    
}
