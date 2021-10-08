/*
 * Copyright (C) Unimed São Carlos - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Marcelo S. Silva <marcelo.silva@unimedsaocarlos.com.br>, Jun 2016
 */
package Aula2;

/**
 *
 * @author Marcelo S. Silva <marcelo.silva@unimedsaocarlos.com.br>
 */
public class Aluno {
    private String nome;
    private String telefone;
    private String matricula; 

    public Aluno(String nome) {
        this.nome = nome;
    }    
    
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //chamando o método de impressão para o próprio componente alunos
    public void ImprimeDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Matricula: " + this.getMatricula());
        
    }
    
    //Estático, média
    public static double Media(double nota1, double nota2){
        return(nota1+nota2)/2;
    }
    
}
