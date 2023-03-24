package strategy;

/*
 *  Professor Gerson Risso
 */
public class IP3 implements Preco{

    @Override
    public double calcPreco(Orcamento orcamento) {
         return orcamento.getValor()*0.25;
    }

}
