package beans;

import classes.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "pessoaBean")
@RequestScoped
public class pessoaBean {
    
    private Pessoa pessoa  = new Pessoa();
    //para armazenar valor, statis para persistir o valor
    private static List<Pessoa> lstPessoas = new ArrayList();
 
    public pessoaBean() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getLstPessoas() {
        return lstPessoas;
    }

    public void setLstPessoas(List<Pessoa> lstPessoas) {
        pessoaBean.lstPessoas = lstPessoas;
    }
    //dois métodos, um para adicionar e outro para excluir elementos    
    public void addPessoa(){
        pessoaBean.lstPessoas.add(this.pessoa);
    }
    
    public void  excluirPessoa(Pessoa pess){
        pessoaBean.lstPessoas.remove(pess);
    }
       
}
