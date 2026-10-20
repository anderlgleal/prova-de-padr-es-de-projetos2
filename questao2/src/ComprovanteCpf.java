// Autor: Anderson Gabriel Leal
public class ComprovanteCpf implements ComprovanteMatricula {

    public String descrever(String nomeAluno, String documentoAluno) {
        return "Comprovante de matricula - Aluno: " + nomeAluno + " - CPF: " + documentoAluno;
    }
}
