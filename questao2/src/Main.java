// Autor: Anderson Gabriel Leal
public class Main {

    public static void main(String[] args) {
        Matricula matriculaBrasil = new Matricula(new FabricaBrasil(), "Joao Silva", "123.456.789-00", 500.00);
        Matricula matriculaChile = new Matricula(new FabricaChile(), "Camila Rojas", "12.345.678-9", 90000.00);

        matriculaBrasil.confirmar();
        matriculaChile.confirmar();
    }
}
