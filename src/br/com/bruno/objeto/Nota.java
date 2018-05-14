/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno.objeto;

/**
 * 
 *
 * @author SATC
 */
public class Nota {
    
    private String disciplina;
    private tipoAvaliacao tipo;
    private float nota;

    public Nota(String disciplina, tipoAvaliacao tipo, float nota) {
        this.disciplina = disciplina;
        this.tipo = tipo;
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public tipoAvaliacao getTipo() {
        return tipo;
    }

    public void setTipo(tipoAvaliacao tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nota{" + "disciplina=" + disciplina + ", nota=" + nota + '}';
    }
    
    
    
}
