package model;

import Controller.FaculdadeController;

public class Administrador {
    private int idAdm;
    private String nome;

    public Administrador(int idAdm, String nome) {
        this.idAdm = idAdm;
        this.nome = nome;
    }

    public int getIdAdm() {return idAdm;}
    public void setIdAdm(int idAdm) {this.idAdm = idAdm;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    //metodos
    public void cadastrarAluno(String nome, int matricula){
        FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();
        sistemaFaculdade.cadastrarAluno(nome, matricula);
    };

    public void cadastrarDisciplina(String codigoDisciplina, String nomeDisciplina, String descricaoDisciplina){
        FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();
        sistemaFaculdade.cadastrarDisciplina(codigoDisciplina, nomeDisciplina, descricaoDisciplina);
    };

    public void matricularAluno(int matriculaAluno, String codigoDisciplina){
        FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();
        sistemaFaculdade.matricularAluno(matriculaAluno, codigoDisciplina);
    };

    public void vincularDisciplinaCurso(String nomeCurso, String codigoDisciplina){
        FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();
        sistemaFaculdade.vincularDisciplinaCurso(nomeCurso, codigoDisciplina);
    };

    public void desvincularDisciplinaCurso(String nomeCurso, String codigoDisciplina){
        FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();
        sistemaFaculdade.desvincularDisciplina(nomeCurso, codigoDisciplina);
    };

    public void cancelarMatricula(int matriculaAluno, String codigoDisciplina){
        FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();
        sistemaFaculdade.cancelarMatricula(matriculaAluno, codigoDisciplina);
    };

    public void buscarAlunoMatricula(int matriculaAluno){
        FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();
        sistemaFaculdade.buscarAlunoPorMatricula(matriculaAluno);
    };
}
