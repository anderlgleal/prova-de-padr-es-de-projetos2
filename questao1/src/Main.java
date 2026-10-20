// Autor: Anderson Gabriel Leal
public class Main {

    public static void main(String[] args) {
        EmissorPassagem aereo = new EmissorPassagemAerea();
        EmissorPassagem rodoviario = new EmissorPassagemRodoviaria();
        EmissorPassagem ferroviario = new EmissorPassagemFerroviaria();

        aereo.emitir("Heloisa Oliveira", 1200.00);
        rodoviario.emitir("Vitor Lustri", 150.00);
        ferroviario.emitir("José Madeiros", 320.00);
    }
}
