/*
 * Copyright (C) Unimed São Carlos - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Marcelo S. Silva <marcelo.silva@unimedsaocarlos.com.br>, Jun 2016
 */
package Aula4;

/**
 *
 * @author Marcelo S. Silva <marcelo.silva@unimedsaocarlos.com.br>
 */
public class Aula4 {
     
    public static void main(String[] args) {
        
        //tratamento de erros
        try{
            System.out.println(args[0]);            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Nenhum argumentos informado");
        }
        finally{
            System.out.println("Obrigada!");
        }
            
        
        
    }
    
}

