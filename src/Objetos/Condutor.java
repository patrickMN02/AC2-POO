
package Objetos;


public class Condutor{
    private String nome;
    private String cpf;
    private String dataNasc;
    private double salario;

    public Condutor(String nome, String cpf, String dataNasc, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibe() {
        System.out.println("Nome: "+nome+"\n"
                         + "Cpf: "+cpf+"\n"
                         + "Data de nascimento: "+dataNasc+"\n"
                         + "Salário: "+salario);
    }
    
    
    
}
