
package Objetos;


public class Carro implements Veiculo{
    
    private String nome;
    private int qntdPortas;
    private String combustivel;
    private String placa;
    private double consumo;

    public Carro(String nome, int qntdPortas, String combustivel, String placa, double consumo) {
        this.nome = nome;
        this.qntdPortas = qntdPortas;
        this.combustivel = combustivel;
        this.placa = placa;
        this.consumo = consumo;
    }  
    

    @Override
    public String getNome(String nome) {
        return nome;
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
    
    public void exibe(){
        System.out.println("Nome do Carro: "+nome+"\n"
                         + "Combustível: "+combustivel+"\n"
                         + "Quantidade de portas: "+qntdPortas+"\n"
                         + "Consumo: "+consumo);
        System.out.println("O gasto com combustivel foi de R$"+gasto(500, 4.5));
    }
    
}
