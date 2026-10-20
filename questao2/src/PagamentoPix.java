// Autor: Anderson Gabriel Leal
public class PagamentoPix implements Pagamento {

    public String descrever(double valor) {
        return String.format("Pagamento Pix: R$ %.2f", valor);
    }
}
