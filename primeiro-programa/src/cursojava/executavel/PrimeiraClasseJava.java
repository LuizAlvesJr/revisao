package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("João da Silva");
		aluno1.setIdade (50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("44455.45545.545");
		aluno1.setNumeroCpf("102.105.457-51");
		aluno1.setNomeMae("Shirley");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDEV");
		
		System.out.println("Nome aluno " + aluno1.getNome());
		System.out.println("Idade é "+ aluno1.getIdade());
		System.out.println("Data nascimento "+ aluno1.getDataNascimento());
		
		/*==============================================*/
		System.out.println("==================================================");
		Aluno aluno2 =  new Aluno();
		aluno2.setNome("Carlos Jose");
		aluno2.setIdade(25);
		aluno2.setDataNascimento("19/05/1993");
		
		
		System.out.println("Nome aluno " + aluno2.getNome());
		System.out.println("Idade é "+ aluno2.getIdade());
		System.out.println("Data nascimento "+ aluno2.getDataNascimento());
		Aluno aluno4 = new Aluno();
		
		
	} 
	

}
