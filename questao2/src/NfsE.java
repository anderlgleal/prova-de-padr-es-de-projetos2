// Autor: Anderson Gabriel Leal
public class NfsE implements DocumentoFiscal {

    public String descrever(double valor) {
        return String.format("NFS-e - ISS 5%%: R$ %.2f", valor * 0.05);
    }
}
