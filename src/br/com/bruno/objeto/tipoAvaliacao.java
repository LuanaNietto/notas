/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno.objeto;

/**
 *
 * @author SATC
 */
public enum tipoAvaliacao {
    
    Prova("Prova"),
    Trabalho("Trabalho"),
    Seminario("Seminario");
    
     private String nomeAvaliacao;

    public String getNomeAvaliacao() {
        return nomeAvaliacao;
    }
     
private tipoAvaliacao( String nome){
    nomeAvaliacao = nome;
    }

    
   
    
    
    
    
    
}
