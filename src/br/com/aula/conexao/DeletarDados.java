package br.com.aula.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarDados {

	public static void main(String[] args) {
		
		Connection conexao = CONEXAOBD.conectar();
		if (conexao !=null) {
			String sql = "DELETE FROM Alunos WHERE id = ?";
			Scanner scanner = new Scanner (System.in);
			try {
				System.out.println ("Digite o ID do aluno que deseja deletar: ");
				int id = scanner .nextInt();
				
				PreparedStatement stmt = conexao.prepareStatement (sql);
				stmt.setInt (1,id);
				
				int rowsDeleted  = stmt.executeUpdate();
				
				if (rowsDeleted > 0 ) {
					System.out.println ("Registro Deletado com sucesso!");
				}else {
					System.out.println ("Nennum registro encontrado com o ID especificado");
				}
			}catch (SQLException e) {
				System.err.println ("Erro ao deletar dados: " + e.getMessage());
			} finally {
				try {
					if (conexao != null) conexao.close();
				} catch (SQLException e) {
					System.err.println ("Erro ao fechar conexao" + e.getMessage());
				}
				scanner.close ();
			}
		}
	}
}
