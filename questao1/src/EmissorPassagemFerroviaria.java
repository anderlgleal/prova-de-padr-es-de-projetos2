// Autor: Anderson Gabriel Leal
public class EmissorPassagemFerroviaria extends EmissorPassagem {

    protected Passagem criarPassagem(String nomePassageiro, double valorTarifa) {
        return new PassagemFerroviaria(nomePassageiro, valorTarifa);
    }
}
