
package bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "pessoaBean")
@RequestScoped
public class pessoaBean {
    private String nome;
    private String msg;
    
    public pessoaBean() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public void enviar (){
        this.msg = "Olá, " + this.nome + "!";
    }
    
    
    
}
