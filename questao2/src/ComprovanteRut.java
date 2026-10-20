// Autor: Anderson Gabriel Leal
public class ComprovanteRut implements ComprovanteMatricula {

    public String descrever(String nomeAluno, String documentoAluno) {
        return "Comprovante de matricula - Aluno: " + nomeAluno + " - RUT: " + documentoAluno;
    }
}
