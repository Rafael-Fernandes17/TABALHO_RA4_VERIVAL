import Controller.FaculdadeController;
import model.Aluno;
import model.Curso;
import model.Professor;
import model.Situacao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //chamando o sistema da faculdade
    FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();

    // Requisito 1 – Cadastrar aluno
    //caso 1
    //sistemaFaculdade.cadastrarAluno("Rafael", 1);
    //sistemaFaculdade.cadastrarAluno("Rafael", 1);

    //caso 2
    //sistemaFaculdade.cadastrarAluno("Rafael", 1);


    // Requisito 2 – Cadastrar disciplina
    //caso 3
    //sistemaFaculdade.cadastrarDisciplina("b1", "VeriVal", "Legal");
    //sistemaFaculdade.cadastrarDisciplina("b1", "VeriVal", "Legal");

    //caso 4
    //sistemaFaculdade.cadastrarDisciplina("b1", "VeriVal", "Legal");

    // Requisito 3 – Matricular aluno em disciplina
    //caso 5
    //sistemaFaculdade.cadastrarDisciplina("10", "veriVal", "Legal");
    //sistemaFaculdade.matricularAluno(5, "10");

    //caso 6
    //sistemaFaculdade.cadastrarDisciplina("10", "veriVal", "Legal");
    //sistemaFaculdade.cadastrarAluno("Rafael", 5);
    //sistemaFaculdade.matricularAluno(5, "10");
    //sistemaFaculdade.matricularAluno(5, "10");


    // Requisito 4 – Definir situação do aluno
    //caso 7
//    sistemaFaculdade.cadastrarAluno("Rafael", 10);
//    Professor professor = new Professor(1, "Raimundo");
//    professor.definirSituacaoAluno(10, Situacao.APROVADO);
//    professor.definirSituacaoAluno(10, Situacao.APROVADO);

    //caso 8
//    sistemaFaculdade.cadastrarAluno("Rafael", 10);
//    Professor professor = new Professor(1, "Raimundo");
//    professor.definirSituacaoAluno(10, Situacao.APROVADO);
//    System.out.println(sistemaFaculdade.buscarAluno(10).getSituacao());
//    professor.definirSituacaoAluno(10, Situacao.RECUPERACAO);
//    System.out.println(sistemaFaculdade.buscarAluno(10).getSituacao());


    //falhou
    // Requisito 5 – Vincular disciplina a curso
//    sistemaFaculdade.cadastrarDisciplina("1b", "veriVal", "legal");
//    Curso curso = new Curso(1, "Engenharia de software");
//    sistemaFaculdade.vincularDisciplinaCurso("Engenharia de software", "1b");

    // Requisito 6 – Consultar situação
    //caso 11
//    sistemaFaculdade.cadastrarAluno("Rafael", 1);
//    Professor professor = new Professor(1, "Paulo");
//    professor.definirSituacaoAluno(1, Situacao.APROVADO);
//    Aluno rafael = sistemaFaculdade.buscarAluno(1);
//
//    rafael.consultarSituacao();

    //caso 12
//    sistemaFaculdade.cadastrarAluno("Rafael", 1);
//    Aluno rafael = sistemaFaculdade.buscarAluno(1);
//
//    rafael.consultarSituacao();

//falhou
//    // Requisito 7 – Desvincular disciplina de curso
//    public String desvincularDisciplina(String nomeCurso, String codigoDisciplina) { return ""; }


    // Requisito 8 – Cancelar matrícula
    //caso 15
//    sistemaFaculdade.cadastrarAluno("Rafael", 10);
//    sistemaFaculdade.cadastrarDisciplina("1b", "veriVal", "Legal");
//    sistemaFaculdade.matricularAluno(10, "1b");
//    sistemaFaculdade.cancelarMatricula(10, "1b");

    //caso 16
//    sistemaFaculdade.cadastrarAluno("Rafael", 10);
//    sistemaFaculdade.cadastrarDisciplina("1b", "veriVal", "Legal");
//    sistemaFaculdade.cancelarMatricula(10, "1b");


    // Requisito 9 – Listar alunos matriculados
//    //caso 17
//    sistemaFaculdade.cadastrarAluno("Rafael", 10);
//    sistemaFaculdade.cadastrarAluno("Bruno", 11);
//    sistemaFaculdade.cadastrarDisciplina("1b", "veriVal", "Legal");
//    sistemaFaculdade.matricularAluno(10, "1b");
//    sistemaFaculdade.matricularAluno(11, "1b");
//    Professor professor = new Professor(1, "Paulo");
//    System.out.println();
//    professor.listarAlunosDisciplina("1b");

    //caso 18
//    sistemaFaculdade.cadastrarAluno("Rafael", 10);
//    sistemaFaculdade.cadastrarAluno("Bruno", 11);
//    sistemaFaculdade.cadastrarDisciplina("1b", "veriVal", "Legal");
//    Professor professor = new Professor(1, "Paulo");
//    System.out.println();
//    professor.listarAlunosDisciplina("1b");

    // Requisito 10 – Buscar aluno pela matrícula
    //caso 19
//    sistemaFaculdade.cadastrarAluno("Ana", 10);
//    System.out.println();
//    sistemaFaculdade.buscarAlunoPorMatricula(10);

//    //caso 20
//    System.out.println();
//    sistemaFaculdade.buscarAlunoPorMatricula(10);
}
