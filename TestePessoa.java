import java.util.Calendar;

public class TestePessoa {
	
	String nome;
	int idade;
	String genero;
	String corCabelo;
	boolean possuiDeficiencia = false;
	int anoNascimento;
	static int buracoDoZois = 2;
	
	
	static int somar(int n1, int n2) {
		return n1 + n2;
	}
	
	void calculaIdade(int anoAtual) {
		idade = anoAtual - anoNascimento;
		
	}
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		TestePessoa pessoa1 = new TestePessoa();
		pessoa1.anoNascimento = 1996;
		System.out.println(pessoa1.idade);
		pessoa1.calculaIdade(anoAtual);
		System.out.println(pessoa1.idade);
	}

}
