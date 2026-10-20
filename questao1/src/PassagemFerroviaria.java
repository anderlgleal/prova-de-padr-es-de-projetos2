// Autor: Anderson Gabriel Leal
public class PassagemFerroviaria extends Passagem {

    public PassagemFerroviaria(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    public String getModal() {
        return "Ferroviario";
    }

    public double calcularTaxaEmbarque() {
        return valorTarifa * 0.05;
    }

    public String getDocumentosExigidos() {
        return "Documento de identidade com foto, comprovante de reserva";
    }
}
