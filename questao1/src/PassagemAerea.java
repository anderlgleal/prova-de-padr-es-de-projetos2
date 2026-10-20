// Autor: Anderson Gabriel Leal
public class PassagemAerea extends Passagem {

    public PassagemAerea(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    public String getModal() {
        return "Aereo";
    }

    public double calcularTaxaEmbarque() {
        return valorTarifa * 0.08;
    }

    public String getDocumentosExigidos() {
        return "Documento de identidade com foto, bilhete eletronico (e-ticket)";
    }
}
