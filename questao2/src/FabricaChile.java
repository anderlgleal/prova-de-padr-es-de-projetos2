// Autor: Anderson Gabriel Leal
public class FabricaChile implements FabricaMatricula {

    public DocumentoFiscal criarDocumentoFiscal() {
        return new BoletaElectronica();
    }

    public Pagamento criarPagamento() {
        return new PagamentoWebpay();
    }

    public ComprovanteMatricula criarComprovante() {
        return new ComprovanteRut();
    }
}
