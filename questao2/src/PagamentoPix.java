// Autor: Anderson Gabriel Leal
public class PagamentoPix implements Pagamento {

    public String descrever(double valor) {
        return String.format("Pagamento via Pix: R$ %.2f", valor);
    }
}
