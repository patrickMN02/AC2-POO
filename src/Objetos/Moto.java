
package Objetos;


public class Moto implements Veiculo{
    
    private String nome;
    private String combustivel;
    private String placa;
    private double consumo;
    private int cilindradas;

    public Moto(String nome, String combustivel, String placa, double consumo, int cilindradas) {
        this.nome = nome;
        this.combustivel = combustivel;
        this.placa = placa;
        this.consumo = consumo;
        this.cilindradas = cilindradas;
    }    

    @Override
    public String getNome(String nome) {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public double gasto(double distancia, double valorCombustivel) {
        double gasto = 0;
        
        gasto = distancia * valorCombustivel;//distancia em km.
        return gasto;
    }

    @Override
    public String getCombustivel() {
        return combustivel;
    }

    @Override
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public double getConsumo() {
        return consumo;
    }

    @Override
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void exibe() {
        System.out.println("Nome da Moto: "+nome+"\n"
                         + "Combustível: "+combustivel+"\n"
                         + "Cilindradas: "+cilindradas+"\n"
                         + "Consumo: "+consumo);
        System.out.println("O gasto com combustivel foi de R$"+gasto(500, 4.5));
    }
    
}
