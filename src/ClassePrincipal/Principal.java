
package ClassePrincipal;
import Objetos.Caminhao;
import Objetos.Carro;
import Objetos.Condutor;
import Objetos.Moto;
import Objetos.Relatorio;
import Objetos.Veiculo;
import Objetos.Viagem;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
          Relatorio r = new Relatorio();
        
        
          Scanner ler = new Scanner(System.in);
          int escolha = 0;
            //System.out.println("Viagem: ");
            Viagem vi = new Viagem("Votorantim", "São Paulo", 500);
            r.add(vi);
            
            //System.out.println("Condutor: ");
            Condutor cond = new Condutor("Patrick", "123.456.789.00", "23/10/2002", 10);
            r.add(cond);
            
            Carro c = new Carro("Golf GTI", 4, "Gasolina", "KWU967", 5);
            r.add(c);            
            
            Moto m = new Moto("BMW R1200", "Gasolina", "DGTF96", 2, 3000);
            r.add(m);
            
            Caminhao ca = new Caminhao("Euro Truck", "Diesel", "POW48C", 9, 6);
            r.add(ca);
            
            System.out.println("Deseja imprimir? SIM(1)/NÃO(2)");
            escolha = ler.nextInt();
            
            switch(escolha){
                case 1:
                    r.imprimeCondutores();
                    r.imprimeViagem();
                    r.imprimeVeiculos();
                    break;
                case 2:
                    System.out.println("Obrigado!!!");
                    break;
            }
            
        
    }
}
