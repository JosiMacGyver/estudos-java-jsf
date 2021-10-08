
package br.com.josi.primeiroprojeto.c_dto;

public class Product {
    
    private String id;
    private String name;
    private String status;
    private int price;

    public Product() {
        
    }      

    public Product(String randomId, String randomName, String randomStatus, int randomPrice) {
        this.id = randomId;
        this.name = randomName;
        this.status = randomStatus;
        this.price = randomPrice;
    }
    

}
