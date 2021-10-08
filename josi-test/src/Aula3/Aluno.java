/*
 * Copyright (C) Unimed São Carlos - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Marcelo S. Silva <marcelo.silva@unimedsaocarlos.com.br>, Jun 2016
 */
package Aula3;

/**
 *
 * @author Marcelo S. Silva <marcelo.silva@unimedsaocarlos.com.br>
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String telefone;
    
     public Aluno() {
    }

    public Aluno(String nome, String matricula, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
    }

   
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    //método que retorna os dados recebidos
    public String getDados(){
        return "Nome: "+this.nome+
                "\nTelefone: "+ this.telefone+
                "\nMatrícula: "+ this.matricula+
                "\n";
                        
    }
    
    
}
