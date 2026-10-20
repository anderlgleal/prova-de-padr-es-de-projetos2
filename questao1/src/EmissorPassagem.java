// Autor: Anderson Gabriel Leal
public abstract class EmissorPassagem {

    protected abstract Passagem criarPassagem(String nomePassageiro, double valorTarifa);

    public final void emitir(String nomePassageiro, double valorTarifa) {
        Passagem passagem = criarPassagem(nomePassageiro, valorTarifa);
        double taxa = passagem.calcularTaxaEmbarque();

        System.out.println("Modal: " + passagem.getModal());
        System.out.println("Passageiro: " + passagem.getNomePassageiro());
        System.out.printf("Taxa de embarque: R$ %.2f%n", taxa);
        System.out.println("Documentos exigidos: " + passagem.getDocumentosExigidos());
        System.out.println();
    }
}
