package Controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

// Todos os dados ficam guardados em listas na memória (sem banco de dados)
public class FaculdadeController {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    private static FaculdadeController instanciaFaculdadeController;

    // Construtor privado
    private FaculdadeController() {
    }

    //Metodo para acessar a unica instância
    public static FaculdadeController getInstancia() {
        if (instanciaFaculdadeController == null) {
            instanciaFaculdadeController = new FaculdadeController();
        }

        return instanciaFaculdadeController;
    }

    public List<Curso> getCursos() {return cursos;}
    public void setCursos(List<Curso> cursos) {this.cursos = cursos;}

    public List<Aluno> getAlunos() {return alunos;}
    public void setAlunos(List<Aluno> alunos) {this.alunos = alunos;}

    public List<Disciplina> getDisciplinas() {return disciplinas;}
    public void setDisciplinas(List<Disciplina> disciplinas) {this.disciplinas = disciplinas;}

    // ===== Requisito 1 – Cadastrar aluno =====
    public String cadastrarAluno(String nome, int matricula) {
        if (buscarAluno(matricula) != null) {
            System.out.println("Cadastro negado:");
            System.out.println("Aluno já cadastrado");
            return null;
        }
        alunos.add(new Aluno(nome, matricula));
        System.out.println("Aluno cadastrado com sucesso!");
        return null;
    }

    // ===== Requisito 2 – Cadastrar disciplina =====
    public String cadastrarDisciplina(String codigoDisciplina, String nomeDisciplina, String descricaoDisciplina) {
        if (buscarDisciplina(codigoDisciplina) != null) {
            System.out.println("Cadastro negado:");
            System.out.println("Já existe uma disciplina com esse código!");
            return null;
        }
        disciplinas.add(new Disciplina(codigoDisciplina, nomeDisciplina, descricaoDisciplina));
        System.out.println("Disciplina cadastrada com sucesso!");
        return null;
    }

    // ===== Requisito 3 – Matricular aluno em disciplina =====
    public String matricularAluno(int matricula, String codigoDisciplina) {

        if (buscarMatriculaEmDisciplina(matricula, codigoDisciplina) != null) {
            System.out.println("Matricula negada:");
            System.out.println("Esse aluno já esta matriculado nessa disciplina!");
            return null;
        }

        Aluno aluno = buscarAluno(matricula);
        Disciplina disciplina = buscarDisciplina(codigoDisciplina);

        disciplina.getAlunos().add(aluno);
        System.out.println("Matrícula realizada com sucesso!");
        return null;
    }

    // ===== Requisito 4 – Definir situação do aluno =====
    public String definirSituacao(int matricula, Situacao novaSituacao) {
        Aluno aluno = buscarAluno(matricula);
        if (aluno == null) {
            System.out.println("Aluno inexistente");
            return null;
        }

        if (aluno.getSituacao() == novaSituacao) {
            System.out.println("Aluno já está nessa situação");
            return null;
        }

        aluno.setSituacao(novaSituacao);
        System.out.println("Situação atualizada com sucesso");
        return null;
    }

    // ===== Requisito 5 – Vincular disciplina a curso =====

    public String vincularDisciplinaCurso(String nomeCurso, String codigoDisciplina) {
        Curso curso = buscarCurso(nomeCurso);
        Disciplina disciplina = buscarDisciplina(codigoDisciplina);

        if (curso == null || disciplina == null) {
            System.out.println("Curso ou disciplina não encontrados");
            return  null;
        }
        if (curso.getDisciplinasCurso().contains(disciplina)) {
            System.out.println("Vinculo negado:");
            System.out.println("Essa disciplina já esta vinculada ao curso!");
            return null;
        }

        curso.getDisciplinasCurso().add(disciplina);
        System.out.println("Disciplina vinculada com sucesso");
        return  null;
    }


    // ===== Requisito 6 – Consultar situação =====
    public String consultarSituacao(int matricula) {
        Aluno aluno = buscarAluno(matricula);
        if (aluno == null) {
            return "Aluno não encontrado";
        }
        if (aluno.getSituacao() == Situacao.NEUTRO) {
            System.out.println("Situação ainda não definida");
            return null;

        }
        System.out.println("Situação do Aluno: " + aluno.getSituacao());
        return null;
    }

    // ===== Requisito 7 – Desvincular disciplina de curso =====
    public String desvincularDisciplina(String nomeCurso, String codigoDisciplina) {
        Curso curso = buscarCurso(nomeCurso);
        Disciplina disciplina = buscarDisciplina(codigoDisciplina);
        if (curso == null || disciplina == null) {
            return "Curso ou disciplina não encontrado";
        }
        if (!curso.getDisciplinasCurso().contains(disciplina)) {
            System.out.println("Ação negada:");
            System.out.println("Disciplina não está vinculada a esse curso");
            return null;
        }
        curso.getDisciplinasCurso().remove(disciplina);
        System.out.println("Disciplina desvinculada com sucesso");
        return null;
    }

    // ===== Requisito 8 – Cancelar matrícula =====
    public String cancelarMatricula(int matricula, String codigoDisciplina) {
        Aluno aluno = buscarAluno(matricula);
        Disciplina disciplina = buscarDisciplina(codigoDisciplina);

        if (!disciplina.getAlunos().contains(aluno)) {
            System.out.println("Esse aluno não está matriculado nessa disciplina!");
            return null;
        }

        disciplina.getAlunos().remove(aluno);
        System.out.println("Matrícula cancelada com sucesso");
        return null;
    }

    // ===== Requisito 9 – Listar alunos matriculados =====
    public String listarAlunosMatriculados(String codigoDisciplina) {
        Disciplina disciplina = buscarDisciplina(codigoDisciplina);
        ArrayList<Aluno> alunosMatriculados = disciplina.getAlunos();

        if (alunosMatriculados.isEmpty()) {
            System.out.println("Não há alunos matriculados nessa disciplina");
            return null;
        }

        for (Aluno aluno : alunosMatriculados) {
            System.out.println("MATRICULA DO ALUNO: " + aluno.getMatricula());
            System.out.println("NOME DO ALUNO: " + aluno.getNome());
            System.out.println("SITUACAO: " + aluno.getSituacao());
            System.out.println();
        }
        return null;
    }

    // ===== Requisito 10 – Buscar aluno pela matrícula =====
    public void buscarAlunoPorMatricula(int matricula) {
        Aluno aluno = buscarAluno(matricula);
        if (aluno == null) {
            System.out.println("Não foi encontrado nenhum aluno com essa matricula");
            return;
        }
        System.out.println("MATRICULA DO ALUNO: " + aluno.getMatricula());
        System.out.println("NOME DO ALUNO: " + aluno.getNome());
        System.out.println("SITUACAO: " + aluno.getSituacao());
        System.out.println();
    }

    // ===== Métodos auxiliares (procuram nas listas) =====//verificado
    public Aluno buscarAluno(int matricula) {
        for (Aluno aluno : FaculdadeController.getInstancia().getAlunos()) {
            if (aluno.getMatricula() == matricula) return aluno;
        }
        return null;
    }

    private Disciplina buscarDisciplina(String codigo) {
        for (Disciplina disciplina : FaculdadeController.getInstancia().getDisciplinas()) {
            if (disciplina.getCodigoDisciplina().equals(codigo)) return disciplina;
        }
        return null;
    }

    private Curso buscarCurso(String nome) {
        for (Curso curso : FaculdadeController.getInstancia().getCursos()) {
            if (curso.getNomeCurso().equals(nome)) return curso;
        }
        System.out.println("Curso não encontrado por esse nome!");
        return null;
    }

    private Aluno buscarMatriculaEmDisciplina(int matricula, String codigoDisciplina) {
        Disciplina disciplina = buscarDisciplina(codigoDisciplina);
        Aluno aluno = buscarAluno(matricula);

        if(disciplina == null){
            System.out.println("Não possuímos uma disciplina com esse codigo!");
            return  null;
        }

        if(aluno == null){
            System.out.println("Não possuímos um aluno com essa matricula!");
            return  null;
        }

        if(disciplina.getAlunos().contains(aluno)){
            return aluno;
        } else {
            return null;
        }
    }
}
