// Autor: Anderson Gabriel Leal
public class Matricula {

    private FabricaMatricula fabrica;
    private String nomeAluno;
    private String documentoAluno;
    private double valor;

    public Matricula(FabricaMatricula fabrica, String nomeAluno, String documentoAluno, double valor) {
        this.fabrica = fabrica;
        this.nomeAluno = nomeAluno;
        this.documentoAluno = documentoAluno;
        this.valor = valor;
    }

    public void confirmar() {
        DocumentoFiscal documentoFiscal = fabrica.criarDocumentoFiscal();
        Pagamento pagamento = fabrica.criarPagamento();
        ComprovanteMatricula comprovante = fabrica.criarComprovante();

        System.out.println("Matricula confirmada");
        System.out.println(documentoFiscal.descrever(valor));
        System.out.println(pagamento.descrever(valor));
        System.out.println(comprovante.descrever(nomeAluno, documentoAluno));
        System.out.println();
    }
}
