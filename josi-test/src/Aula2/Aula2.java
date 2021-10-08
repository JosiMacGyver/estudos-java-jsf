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
 
public class Aula2 {
    
    public static void main (String[] args){
        /*
        
        //Cadeira
        //criando o objeto C1
        Cadeira c1 = new Cadeira();
        c1.serrar();
        c1.lixar();
        c1.setCor("Azul");
        c1.pintar();
        System.out.println("Cor atual: "+c1.getCor());
        
        // os métodos de um objeto não interfere no outro */
        
        Aluno a1 = new Aluno("Gilberto");
        a1.setTelefone("11111");
        a1.setMatricula("001");
        
        Aluno a2 = new Aluno("Pedro");
        a2.setTelefone("22222");
        a2.setMatricula("002");
        
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Telefone: " + a1.getTelefone());
        System.out.println("Matricula: " + a1.getMatricula());
        
        System.out.println("\n");
        System.out.println("Nome: " + a2.getNome());
        System.out.println("Telefone: " + a2.getTelefone());
        System.out.println("Matricula: " + a2.getMatricula()); 
        
        
        //imprimindo com a função
        System.out.println("\n");
        System.out.println("Imprimindo com a função imprime dados");
        ImprimeDados(a1);
        
        System.out.println("\n");
        ImprimeDados(a2);
        
        //imprimindo pelo modo declarado nos próprios alunos
        System.out.println("\n");
        System.out.println("Imprimindo pelo modo declarado nos próprios alunos");
        a1.ImprimeDados();
        
        System.out.println("\n");
        a2.ImprimeDados();
        
        //imprimindo as médias sem instanciar
        System.out.println("\n");
        double media = Aluno.Media(10, 8);
        System.out.println("Média:" +media);
             
        
    }
    
    //função(método) para imprimir recursivamente lista de atributos
    public static void ImprimeDados(Aluno A){
        System.out.println("Nome: " + A.getNome());
        System.out.println("Telefone: " + A.getTelefone());
        System.out.println("Matricula: " + A.getMatricula());
        
    }
    
    
}