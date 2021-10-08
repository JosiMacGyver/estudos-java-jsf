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
public class Cadeira {
    //classe pública pode ser chamada por qualquer arquivo dentro do projeto
    //classe privada fica restrita ao mesmo arquivo
    //classe protect, privado, mas público para os filhos
    
    //projeto da cadeira
    private final double altura;
    private final double altura_assento;
    private String cor;
    
    //Método construtor tem o mesmo nome que a classe
    public Cadeira(){
        cor = "Marrom";
        altura = 0.50;
        altura_assento = 1.20;
    }
    
    //funções para construir uma cadeira: métodos
    public void serrar(){    
        System.out.println("Serrando a madeira...");
    }
    
    public void lixar(){
         System.out.println("Lixando a madeira...");
    }
        
    
    public void pintar(){
        System.out.println("Lixando a madeira...");
        
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String c){
        // restringe valores possíveis para cor, para strings se usa o "equals"
        if (c.equals("Verde") || c.equals("Vermelho"))
            cor = c;
        else
            System.out.print("A cor desejada não está disponível");
    }
}
