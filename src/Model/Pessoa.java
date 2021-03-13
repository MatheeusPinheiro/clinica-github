
package Model;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private String email;
    private String rg;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String email, String rg, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.rg = rg;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
     
    
    
    
    
    
}
