package br.com.aula.conexao;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1 - Inserir Aluno");
            System.out.println("2 - Atualizar Aluno");
            System.out.println("3 - Deletar Aluno");
            System.out.println("4 - Ler Registro de Alunos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    InserirDados.main(null); // Chama a classe InserirDados
                    break;
                case 2:
                    AtualizarDados.main(null); // Chama a classe AtualizarDados
                    break;
                case 3:
                    DeletarDados.main(null); // Chama a classe DeletarDados
                    break;
                case 4:
                    LerDados.main(null); // Chama a classe LerDados
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        
        scanner.close();
    }
}
