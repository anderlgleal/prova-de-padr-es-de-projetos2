// Autor: Anderson Gabriel Leal
public class PassagemRodoviaria extends Passagem {

    public PassagemRodoviaria(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    public String getModal() {
        return "Rodoviario";
    }

    public double calcularTaxaEmbarque() {
        return valorTarifa * 0.03;
    }

    public String getDocumentosExigidos() {
        return "Documento de identidade com foto";
    }
}
