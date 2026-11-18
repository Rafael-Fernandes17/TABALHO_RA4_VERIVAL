package model;

import Controller.FaculdadeController;

public class Aluno {
    private int matricula;
    private String nome;
    private Situacao situacao;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.situacao = Situacao.NEUTRO;
    }

    public int getMatricula() {return matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public Situacao getSituacao() {return situacao;}
    public void setSituacao(Situacao situacao) {this.situacao = situacao;}

    //metodos
    public void consultarSituacao(){
        FaculdadeController sistemaFaculdade = FaculdadeController.getInstancia();
        sistemaFaculdade.consultarSituacao(this.matricula);
    };
}
