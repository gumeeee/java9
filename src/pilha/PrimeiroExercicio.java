package pilha;

import java.util.Scanner;
import java.util.Stack;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> pilhaLivros = new Stack<>();

		int opcao;
		do {
			System.out.println("\nMenu:");
			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros da Pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Finalizar o programa");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				scanner.nextLine(); // Consume the newline character
				String novoLivro = scanner.nextLine();
				pilhaLivros.push(novoLivro);
				System.out.println(novoLivro + "\n Livro adicionado!");
				break;
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Livros na pilha:");
					for (String livro : pilhaLivros) {
						System.out.println("- " + livro);
					}
				}
				break;
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Livro retirado: " + pilhaLivros.pop());
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 0);

		scanner.close();
	}

}
