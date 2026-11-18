package model;

import Controller.FaculdadeController;

public class Professor {
    private int idProfessor;
    private String nomeProfessor;

    public Professor(int idProfessor, String nomeProfessor) {
        this.idProfessor = idProfessor;
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeProfessor() {return nomeProfessor;}
    public void setNomeProfessor(String nomeProfessor) {this.nomeProfessor = nomeProfessor;}

    public int getIdProfessor() {return idProfessor;}
    public void setIdProfessor(int idProfessor) {this.idProfessor = idProfessor;}


    //Metodos
    public void definirSituacaoAluno(int matricula, Situacao novaSituacao){
        FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();
        sistemaFaculdade.definirSituacao(matricula, novaSituacao);
    };

    public void listarAlunosDisciplina(String codigoDisciplina){
        FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();
        sistemaFaculdade.listarAlunosMatriculados(codigoDisciplina);
    }
}
