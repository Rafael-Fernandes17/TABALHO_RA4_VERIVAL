package model;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigoDisciplina;
    private String nomeDisciplina;
    private String descricaoDisciplina;
    private ArrayList<Aluno> alunos;

    public Disciplina(String codigoDisciplina, String nomeDisciplina, String descricaoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.descricaoDisciplina = descricaoDisciplina;
        this.alunos = new ArrayList<>();
    }

    public String getCodigoDisciplina() {return codigoDisciplina;}
    public void setCodigoDisciplina(String codigoDisciplina) {this.codigoDisciplina = codigoDisciplina;}

    public String getDescricaoDisciplina() {return descricaoDisciplina;}
    public void setDescricaoDisciplina(String descricaoDisciplina) {this.descricaoDisciplina = descricaoDisciplina;}

    public String getNomeDisciplina() {return nomeDisciplina;}
    public void setNomeDisciplina(String nomeDisciplina) {this.nomeDisciplina = nomeDisciplina;}

    public ArrayList<Aluno> getAlunos() {return alunos;}
    public void setAlunos(ArrayList<Aluno> alunos) {this.alunos = alunos;}
}
