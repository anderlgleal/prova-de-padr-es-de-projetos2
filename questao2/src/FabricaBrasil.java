// Autor: Anderson Gabriel Leal
public class FabricaBrasil implements FabricaMatricula {

    public DocumentoFiscal criarDocumentoFiscal() {
        return new NfsE();
    }

    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }

    public ComprovanteMatricula criarComprovante() {
        return new ComprovanteCpf();
    }
}
