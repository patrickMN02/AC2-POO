
package Objetos;


public interface Veiculo {
    
    public String getNome(String nome);
    public double gasto(double distancia, double valorCombustivel);
    
    public String getCombustivel();
    public void setCombustivel(String combustivel);
    
    public double getConsumo();
    public void setConsumo(double consumo);
    
    public String getPlaca();
    public void setPlaca(String placa);
    
    public void exibe();
}
