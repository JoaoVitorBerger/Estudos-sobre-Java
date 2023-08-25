package EmpregadoTeste;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criando um objeto Empregado com nome, sobrenome e salário
		Empregado empregado = new Empregado("João", "Silva", 2500.00);

		// Chamando o método que aumenta o salário em 500.00
		empregado.aumentarSalario();

		// Exibindo o novo salário
		System.out.println("Novo salário: " + empregado.getSalario());

		// Criando um objeto Data com uma data específica
		Data data = new Data(8, 4, 2023);

		// Chamando o método que exibe a data
		data.exibirData();
		
		data.verificarDiaDaSemana();
		//System.out.println("dia da semana: ", data.verificarDiaDaSemana());

	}

}
