//tutorial: https://youtu.be/t5zAhyXWUPg
//dados: https://www.primefaces.org/showcase/ui/data/datatable/edit.xhtml?jfwid=11b66

package br.com.josi.primeiroprojeto.c_controlador;

import br.com.josi.primeiroprojeto.c_dto.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class ProductService {
    private final static String[] name;
    private final static String[] status;
    
    static{
        name=new String[10];
        name[0]="Bamboo Watch";
        name[1]="Black Watch";
        name[2]="Blue Band";
        name[3]="Blue T-Shirt";
        name[4]="Bracelet";
        name[5]="Brown Purse";
        name[6]="Chakra Bracelet";
        name[7]="Galaxy Earrings";
        name[8]="Game Controler";
        name[9]="Gaming Set";

        status = new String[10];
        status[0]="INSTOCK";
        status[1]="INSTOCK";
        status[2]="LOWSTOCK";
        status[3]="INSTOCK";
        status[4]="INSTOCK";
        status[5]="OUTTOCK";
        status[6]="LOWTOCK";
        status[7]="INSTOCK";
        status[8]="LOWTOCK";
        status[9]="INSTOCK";

    }
    
    public List<Product> createProducts(int size){
        List<Product> list = new ArrayList<>();
        
        for (int i=0; i<size; i++){
            list.add(new Product(getRandomId(),getRandomName(), getRandomStatus(), getRandomPrice()));
        }
        return list;
    }
    
      
    private String getRandomId(){
        return UUID.randomUUID().toString().substring(0, 9);
        
    }
  
    
      private String getRandomName(){
        return name[(int) (Math.random() * 10)];
        
    }
      private String getRandomStatus(){
        return status[(int) (Math.random() * 10)];
        
    }
      
      private int getRandomPrice(){
        return(int) (Math.random() * 50 + 10);
        
    }
    
    
}
