
package Model;


public class Endereco {
    
    private String bairro;
    private String rua;
    private String cep;
    private int numero;

    public Endereco() {
    }

    public Endereco(String bairro, String rua, String cep, int numero) {
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
