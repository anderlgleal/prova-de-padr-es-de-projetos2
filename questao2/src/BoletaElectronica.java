// Autor: Anderson Gabriel Leal
public class BoletaElectronica implements DocumentoFiscal {

    public String descrever(double valor) {
        return String.format("Boleta electronica - IVA 19%%: CLP %.2f", valor * 0.19);
    }
}
