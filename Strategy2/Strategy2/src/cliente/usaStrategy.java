package cliente;


/*
*  Professor Gerson Risso
 */
import strategy.*;
import static strategy.Impostos.IP1;
import static strategy.Impostos.IP2;
import static strategy.Impostos.IP3;


public class usaStrategy {

    public static void main(String[] args) {
        Orcamento orc = new Orcamento(500); 
        double algumacoisa = calcularFrete(orc, IP1);
        System.out.println(algumacoisa);
         
    }

    public static double calcularFrete(Orcamento orcamento, Impostos imposto) {
        double preco = -1;
        Preco pagamento=null;
        switch (imposto) {
            case IP1 -> {
                pagamento=new IP1();
                preco = pagamento.calcPreco(orcamento);
            }
            case IP2 -> {
                pagamento=new IP2();
                preco = pagamento.calcPreco(orcamento);
            }
            case IP3 -> {
                pagamento=new IP3();
                preco = pagamento.calcPreco(orcamento);
            }
            default -> {
            }
        }
        return preco;
    }
}
