package model;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int idCurso;
    private String nomeCurso;
    private List<Disciplina> disciplinasCurso;

    public Curso(int idCurso, String nomeCurso) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.disciplinasCurso = new ArrayList<>();
    }

    public int getIdCurso() {return idCurso;}
    public void setIdCurso(int idCurso) {this.idCurso = idCurso;}

    public List<Disciplina> getDisciplinasCurso() {return disciplinasCurso;}
    public void setDisciplinasCurso(List<Disciplina> disciplinasCurso) {this.disciplinasCurso = disciplinasCurso;}

    public String getNomeCurso() {return nomeCurso;}
    public void setNomeCurso(String nomeCurso) {this.nomeCurso = nomeCurso;}


}
