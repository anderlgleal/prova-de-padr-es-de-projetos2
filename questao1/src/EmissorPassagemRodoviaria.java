// Autor: Anderson Gabriel Leal
public class EmissorPassagemRodoviaria extends EmissorPassagem {

    protected Passagem criarPassagem(String nomePassageiro, double valorTarifa) {
        return new PassagemRodoviaria(nomePassageiro, valorTarifa);
    }
}
