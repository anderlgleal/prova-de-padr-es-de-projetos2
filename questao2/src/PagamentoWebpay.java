// Autor: Anderson Gabriel Leal
public class PagamentoWebpay implements Pagamento {

    public String descrever(double valor) {
        return String.format("Pagamento via Webpay: CLP %.2f", valor);
    }
}
