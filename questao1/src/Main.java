// Autor: Anderson Gabriel Leal
public class Main {

    public static void main(String[] args) {
        EmissorPassagem aereo = new EmissorPassagemAerea();
        EmissorPassagem rodoviario = new EmissorPassagemRodoviaria();
        EmissorPassagem ferroviario = new EmissorPassagemFerroviaria();

        aereo.emitir("Ana Souza", 1200.00);
        rodoviario.emitir("Bruno Lima", 150.00);
        ferroviario.emitir("Carla Mendes", 320.00);
    }
}
