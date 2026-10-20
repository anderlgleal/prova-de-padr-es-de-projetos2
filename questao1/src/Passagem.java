// Autor: Anderson Gabriel Leal
public abstract class Passagem {

    protected String nomePassageiro;
    protected double valorTarifa;

    public Passagem(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    public abstract String getModal();

    public abstract double calcularTaxaEmbarque();

    public abstract String getDocumentosExigidos();

    public String getNomePassageiro() {
        return nomePassageiro;
    }
}
