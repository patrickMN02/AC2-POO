
package Objetos;


public class Viagem{
    private String cidadeOrigem;
    private String cidadeDestino;
    private double Distancia;
//    private String veiculo;
//    private Condutor condutor;

    public Viagem(String cidadeOrigem, String cidadeDestino, double Distancia) {
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.Distancia = Distancia;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public double getCidadeDistancia() {
        return Distancia;
    }

    public void setCidadeDistancia(double Distancia) {
        this.Distancia = Distancia;
    }

//    public String getVeiculo() {
//        return veiculo;
//    }
//
//    public void setVeiculo(String veiculo) {
//        this.veiculo = veiculo;
//    }
//
//    public Condutor getCondutor() {
//        return condutor;
//    }
//
//    public void setCondutor(Condutor condutor) {
//        this.condutor = condutor;
//    }
    
    public void exibe(){
        System.out.println("Cidade de origem: "+cidadeOrigem+"\n"
                         + "Cidade de destino: "+cidadeDestino+"\n"
                         + "Distancia: "+Distancia+"\n");
    }
    
    public double custo(){
        
        
        return 2;
    }
    
}
