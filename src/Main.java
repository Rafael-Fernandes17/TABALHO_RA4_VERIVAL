import Controller.FaculdadeController;
import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //chamando o sistema da faculdade
    FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();
    Administrador adm = new Administrador(1, "ADM");

    // Requisito 1 – Cadastrar aluno
    //caso 1
//    adm.cadastrarAluno("Rafael", 1);
//    adm.cadastrarAluno("Rafael", 1);

//    //caso 2
//    adm.cadastrarAluno("Ana", 2);
//
//
//    // Requisito 2 – Cadastrar disciplina
//    //caso 3
//    adm.cadastrarDisciplina("b1", "VeriVal", "Legal");
//    adm.cadastrarDisciplina("b1", "VeriVal", "Legal");

//    //caso 4
//    adm.cadastrarDisciplina("b2", "VeriVal", "Legal");

//    // Requisito 3 – Matricular aluno em disciplina
    //caso 5
//    adm.cadastrarDisciplina("10", "veriVal", "Legal");
//    adm.matricularAluno(5, "10");
//
//    //caso 6
//    adm.cadastrarDisciplina("10", "veriVal", "Legal");
//    adm.cadastrarAluno("Rafael", 5);
//    adm.matricularAluno(5, "10");
//    adm.matricularAluno(5, "10");
//
//
//    // Requisito 4 – Definir situação do aluno
//    //caso 7
//    adm.cadastrarAluno("Rafael", 10);
//    Professor professor = new Professor(1, "Raimundo");
//    professor.definirSituacaoAluno(10, Situacao.REPROVADO);
//    professor.definirSituacaoAluno(10, Situacao.REPROVADO);
//
//    //caso 8
//    adm.cadastrarAluno("Rafael", 8);
//    Professor professor = new Professor(1, "Raimundo");
//    professor.definirSituacaoAluno(8, Situacao.RECUPERACAO);
//    System.out.println(sistemaFaculdade.buscarAluno(8).getSituacao());
//    professor.definirSituacaoAluno(8, Situacao.APROVADO);
//    System.out.println(sistemaFaculdade.buscarAluno(8).getSituacao());
//
//

//    // Requisito 5 – Vincular disciplina a curso
//    //caso 9
//    adm.cadastrarDisciplina("1b", "veriVal", "legal");
//    adm.cadastrarCurso(1, "Engenharia de software");
//    adm.vincularDisciplinaCurso("Engenharia de software", "1b");

//    //caso 10
//    adm.cadastrarDisciplina("1b", "veriVal", "legal");
//    adm.cadastrarCurso(1, "Engenharia de software");
//    adm.vincularDisciplinaCurso("Engenharia de software", "1b");
//    adm.vincularDisciplinaCurso("Engenharia de software", "1b");

//    // Requisito 6 – Consultar situação
//    //caso 11
//    adm.cadastrarAluno("Rafael", 12);
//    Professor professor = new Professor(1, "Paulo");
//    professor.definirSituacaoAluno(12, Situacao.APROVADO);
//    Aluno rafael = sistemaFaculdade.buscarAluno(12);
//
//    rafael.consultarSituacao();
//
//    //caso 12
//    adm.cadastrarAluno("Rafael", 13);
//    Aluno rafael = sistemaFaculdade.buscarAluno(13);
//
//    rafael.consultarSituacao();


//    // Requisito 7 – Desvincular disciplina de curso
    //caso 13
//    adm.cadastrarCurso(1, "Engenharia de software");
//    adm.cadastrarDisciplina("b1", "veriVal", "Legal");
//    adm.vincularDisciplinaCurso("Engenharia de software", "b1");
//    adm.desvincularDisciplinaCurso("Engenharia de software", "b1");

//    //caso 14
//    adm.cadastrarCurso(1, "Engenharia de software");
//    adm.cadastrarDisciplina("b1", "veriVal", "Legal");
//    adm.desvincularDisciplinaCurso("Engenharia de software", "b1");


//    // Requisito 8 – Cancelar matrícula
//    //caso 15
//    adm.cadastrarAluno("Rafael", 10);
//    adm.cadastrarDisciplina("1b", "veriVal", "Legal");
//    adm.matricularAluno(10, "1b");
//    adm.cancelarMatricula(10, "1b");
//
//    //caso 16
//    adm.cadastrarAluno("Rafael", 10);
//    adm.cadastrarDisciplina("1b", "veriVal", "Legal");
//    adm.cancelarMatricula(10, "1b");


//    // Requisito 9 – Listar alunos matriculados
    //caso 17
//    adm.cadastrarAluno("Rafael", 10);
//    adm.cadastrarAluno("Bruno", 11);
//    adm.cadastrarDisciplina("1b", "veriVal", "Legal");
//    adm.matricularAluno(10, "1b");
//    adm.matricularAluno(11, "1b");
//    Professor professor = new Professor(1, "Paulo");
//    System.out.println();
//    professor.listarAlunosDisciplina("1b");

//    //caso 18
//    adm.cadastrarAluno("Rafael", 10);
//    adm.cadastrarAluno("Bruno", 11);
//    adm.cadastrarDisciplina("1c", "veriVal", "Legal");
//    Professor professor = new Professor(1, "Paulo");
//    System.out.println();
//    professor.listarAlunosDisciplina("1c");

//    // Requisito 10 – Buscar aluno pela matrícula
//    //caso 19
//    adm.cadastrarAluno("Ana", 20);
//    System.out.println();
//    adm.buscarAlunoMatricula(20);

//    //caso 20
//    System.out.println();
//    adm.buscarAlunoMatricula(999);
}
