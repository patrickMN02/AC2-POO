
package Objetos;
import java.util.ArrayList;

public class Relatorio{
    
    private ArrayList<Veiculo> veiculo;
    private ArrayList<Condutor> condutor;
    private ArrayList<Viagem> viagem;
    
    public Relatorio(){
        this.veiculo = new ArrayList<Veiculo>();
        this.condutor = new ArrayList<Condutor>();
        this.viagem = new ArrayList<Viagem>();
        
    }    
    public void imprimeCondutores(){ 
        for(int i = 0; i < this.condutor.size(); i++){
            condutor.get(i).exibe();
            System.out.println("----------------------");
        }        
    }
    
    public void add(Condutor c){
        condutor.add(c);
    }
    
    public void imprimeVeiculos(){
        for(int i = 0; i < this.veiculo.size(); i++){
            veiculo.get(i).exibe();
            System.out.println("----------------------");
        }
    }
    
    public void add(Veiculo v){
        veiculo.add(v);
    }
    
    public void imprimeViagem(){
        for(int i = 0; i < this.viagem.size(); i++){
            viagem.get(i).exibe();
            System.out.println("----------------------");
        } 
    }
    
    public void add(Viagem vi){
        viagem.add(vi);
    }

    
    
    
}
