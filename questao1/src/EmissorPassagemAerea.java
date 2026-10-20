// Autor: Anderson Gabriel Leal
public class EmissorPassagemAerea extends EmissorPassagem {

    protected Passagem criarPassagem(String nomePassageiro, double valorTarifa) {
        return new PassagemAerea(nomePassageiro, valorTarifa);
    }
}
