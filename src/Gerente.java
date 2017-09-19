import java.util.ArrayList;
import java.util.List;

public class Gerente {
	
	private List<Aluno> alunos;
	private List<Professor> professores;
	private List<Disciplina> disciplinas;
	private List<Turma> turmas;
	
	public Gerente(){
		this.alunos = new ArrayList<Aluno>();
		this.professores = new ArrayList<Professor>();
		this.disciplinas = new ArrayList<Disciplina>();
		this.turmas = new ArrayList<Turma>();
	}
	
	public void cadastrarAluno(Aluno a){
		this.alunos.add(a);
	}
	
	public void cadastrarProfessor(Professor p){
		this.professores.add(p);
	}
	
	public void cadastrarDisciplina(Disciplina d){
		this.disciplinas.add(d);
	}
	
	public void cadastrarTurma(Turma t){
		this.turmas.add(t);
	}
	
	public Aluno buscaAluno(String mat){
		for(Aluno a: this.alunos){
			if(a.getMatricula().equals(mat)){
				return a;
			}
		}
		return null;
	}
	
	public Professor buscaProfessor(String mat){
		for(Professor p: this.professores){
			if(p.getMatricula().equals(mat)){
				return p;
			}
		}
		return null;
	}
	
	public Disciplina buscaDisciplina(String cod){
		for(Disciplina d: this.disciplinas){
			if(d.getCodigo().equals(cod)){
				return d;
			}
		}
		return null;
	}
	
	public Turma buscaTurma(String cod){
		for(Turma t: this.turmas){
			if(t.getCodigo().equals(cod)){
				return t;
			}
		}
		return null;
	}
	
	public void excluirAluno(String mat){
		for(Aluno a: this.alunos){
			if(a.getMatricula().equals(mat)){
				this.alunos.remove(a);
			}
		}
	}
	
	public void excluirProfessor(String mat){
		for(Professor p: this.professores){
			if(p.getMatricula().equals(mat)){
				this.professores.remove(p);
			}
		}
	}
	
	public void excluirDisciplina(String cod){
		for(Disciplina d: this.disciplinas){
			if(d.getCodigo().equals(cod)){
				this.disciplinas.remove(d);
			}
		}
	}
	
	public void excluirTurma(String cod){
		for(Turma t: this.turmas){
			if(t.getCodigo().equals(cod)){
				this.turmas.remove(t);
			}
		}
	}
	
	public void editarAluno(String mat, Aluno aluno){
		for(Aluno a: this.alunos){
			if(a.getMatricula().equals(mat)){
				this.alunos.remove(a);
				this.alunos.add(aluno);
			}
		}
	}
	
	public void editarProfessor(String mat, Professor professor){
		for(Professor p: this.professores){
			if(p.getMatricula().equals(mat)){
				this.professores.remove(p);
				this.professores.add(professor);
			}
		}
	}

	public void editarDisciplina(String cod, Disciplina disciplina){
		for(Disciplina d: this.disciplinas){
			if(d.getCodigo().equals(cod)){
				this.disciplinas.remove(d);
				this.disciplinas.add(disciplina);
			}
		}
	}

	public void editarTurma(String cod, Turma turma){
		for(Turma t: this.turmas){
			if(t.getCodigo().equals(cod)){
				this.turmas.remove(t);
				this.turmas.remove(turma);
			}
		}
	}
}
