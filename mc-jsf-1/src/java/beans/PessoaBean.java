package beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "PessoaBean")
@Dependent
public class PessoaBean {

    private String nome;
    private String msg;

    public PessoaBean() {
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

    public void cumprimentar(){
        this.msg = "Olá, seu nome é: " + this.nome;
    }

}
