package br.com.universidade.teste;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Curso;
import br.com.universidade.modelo.Professor;
import br.com.universidade.modelo.Turma;
import br.com.universidade.modelo.Unidade;
import br.com.universidade.util.Magica;

public class TesteTurma {

	public static void main(String[] args) {


		Turma turma = new Turma(
				Magica.s("Digite a Sigla"),
				Magica.s("Digite o periodo"),
				Magica.s("Digite a sala"),
				new Aluno(
						Magica.i("Digite o rm do aluno"),
						Magica.s("Digite o nome do aluno"),
						Magica.s("Digite o telefone do aluno"),
						Magica.b("Aluno está ativo?")
						),
				new Professor(
						Magica.s("Digite o nome do Professor"),
						Magica.f("Digite o Valor da hora"),
						Magica.s("Digite a formação"),
						Magica.s("Digite qual a área de atuação"),
						Magica.s("Digite o email")
						),
				new Curso(
						Magica.s("Digite a descrição do curso"),
						Magica.i("Digite a carga Horária do Curso"),
						Magica.f("Digite o valor do curo"),
						new Unidade(
								Magica.s("Digite o nome da Unidade"),
								Magica.s("Digite o nome do bairro"),
								Magica.s("Digite o numero do telefone")
								)
						)
				);




		System.out.println(turma.toString());
		System.out.println(turma.getProfessor().calcularSalario(10));
		System.out.println(turma.getProfessor().getSaudacao());
		System.out.println(turma.getAluno().getSaudacao());
		System.out.println(turma.getResumo());
		System.out.println(turma.getCurso().getMensalidade());

	}
	
}
