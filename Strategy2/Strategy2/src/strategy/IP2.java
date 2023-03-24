package strategy;

/*
 *  Professor Gerson Risso
 */
public class IP2 implements Preco{

    @Override
    public double calcPreco(Orcamento orcamento) {
         return orcamento.getValor()*0.15;
    }

}
