/*
 * Copyright (C) Unimed São Carlos - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Marcelo S. Silva <marcelo.silva@unimedsaocarlos.com.br>, Jun 2016
 */
package Aula3;

import java.util.ArrayList;

/**
 *
 * @author Marcelo S. Silva <marcelo.silva@unimedsaocarlos.com.br>
 */
public class Aula3 {
    public static void main (String[] args ){
        /*
        //sobre variáveis e listas
        
        int valor = 5;  // isso é um ponteiro do tipo int, não uma variável
        int valores[] = new int[10];
        
        double valor_d = 10.5; //ponteiro do tipo double
        
        boolean maior_de_idade = true;
        
        String nome = "Gilberto Toledo"; //string é uma CLASSE
        char nomec[] = new char[20]; //isso sim é um array
        
        String nome2 = "Gilberto Toledo";
        
        //comparando strings
        if(nome.equals(nome2)){
            System.out.println("Nomes iguais");
        }
        else{
            System.out.println("Nomes diferentes");
        }
        
        //listas
        ArrayList<String> lista = new ArrayList();
        lista.add("Gilberto");
        lista.add("Lucas");
        lista.add("Paulo");
        
        for (int i =0; i<lista.size(); i++){
            System.out.print(lista.get(i));
        } */     
            
        ArrayList<Aluno> ListaAlunos = new ArrayList();
        
        Aluno a1 = new Aluno();
        a1.setNome("Gilberto");
        a1.setTelefone("1111");
        a1.setMatricula("001");        
        ListaAlunos.add(a1);
        
        Aluno a2 = new Aluno();
        a2.setNome("Lucas");
        a2.setTelefone("2222");
        a2.setMatricula("002");        
        ListaAlunos.add(a2);
        
        //pelo construtor
        Aluno a3 = new Aluno ("Paulo", "003", "3333");
        ListaAlunos.add(a3);
        
        //outra forma
        ListaAlunos.add(new Aluno("Bruno", "004", "4444"));
        
        for (int i=0; i<ListaAlunos.size(); i++){
            //imprimindo os dados recebidos de cada aluno
            Aluno temp = ListaAlunos.get(i); //para não ter de chamar o get(i) o tempo todo
            System.out.println(temp.getDados());
        }
        
      
    }
    
}
