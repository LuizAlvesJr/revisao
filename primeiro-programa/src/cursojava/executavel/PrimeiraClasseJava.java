package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* New Aluno() � uma instancia (Cria��o de objeto) */
		/* Aluno1 � uma referencia para o ibejto aluno */
		/*
		 * Aluno aluno1 = new Aluno(); String nome =
		 * JOptionPane.showInputDialog("Qual o nome do aluno? "); String idade =
		 * JOptionPane.showInputDialog("QUal a idade do aluno? "); String dataNascimento
		 * = JOptionPane.showInputDialog("Data de nascimento?" ); String rg =
		 * JOptionPane.showInputDialog("Qual o RG?"); String cpf =
		 * JOptionPane.showInputDialog("Qual o CPF?"); String mae =
		 * JOptionPane.showInputDialog("Qual o nome da m�e? "); String pai =
		 * JOptionPane.showInputDialog("Qual o nome do pai? "); String matricula =
		 * JOptionPane.showInputDialog("Data matricula?"); String serie =
		 * JOptionPane.showInputDialog("Qual a serie?"); String escola =
		 * JOptionPane.showInputDialog ("Nome da escola?"); String nota1 =
		 * JOptionPane.showInputDialog("Qual a nota 1? "); String nota2 =
		 * JOptionPane.showInputDialog("Qual a nota 2? "); String nota3 =
		 * JOptionPane.showInputDialog("Qual a nota 3? "); String nota4 =
		 * JOptionPane.showInputDialog("Qual a nota 4? ");
		 * 
		 * 
		 * aluno1.setNome (nome); aluno1.setIdade(Integer.valueOf(idade));
		 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
		 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
		 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
		 * aluno1.setNomeEscola(escola); aluno1.setNota1(Double.parseDouble(nota1));
		 * aluno1.setNota2(Double.parseDouble(nota2));
		 * aluno1.setNota3(Double.parseDouble(nota3));
		 * aluno1.setNota4(Double.parseDouble(nota4));
		 * 
		 * /* System.out.println("Nome � = "+ aluno1.getNome());
		 * System.out.println("A idade � = " + aluno1.getIdade());
		 * System.out.println("Nascimento = " + aluno1.getDataNascimento());
		 * System.out.println("RG = " + aluno1.getRegistroGeral());
		 * System.out.println("CPF = " + aluno1.getNumeroCpf());
		 * System.out.println("Nome da m�e = " + aluno1.getNomeMae());
		 * System.out.println("Nome do Pai = " + aluno1.getNomePai());
		 * System.out.println("Data da matricula = " + aluno1.getDataMatricula());
		 * System.out.println("Serie matriculada = " + aluno1.getSerieMatriculado());
		 * System.out.println(" = " + aluno1.getSerieMatriculado());
		 * System.out.println("Serie matriculada = " + aluno1.getSerieMatriculado());
		 * System.out.println("Nome escola = " + aluno1.getNomeEscola());
		 * System.out.printf("A nota m�dia do aluno = "+ "%.2f",aluno1.getMediaNota());
		 * System.out.println(); System.out.println("Resultado = "+
		 * (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		 */
		/*
		 * Aluno aluno = new Aluno();
		 * 
		 * System.out.println(aluno1.toString()); System.out.println("Media Aluno = " +
		 * aluno1.getMediaNota()); System.out.println("Resultado = " +
		 * aluno1.getAlunoAprovado());
		 */

		/* Equals e hashcode (Diferenciar e comparar objetos) */

		Aluno aluno1 = new Aluno();

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Luiz");
		aluno2.setNumeroCpf("1234");

		if (aluno1.equals(aluno2)) {
			System.out.println("Aluno s�o iguais!");

		} else {
			System.out.println("Aluno n�o s�o iguais");
		}

	}

}