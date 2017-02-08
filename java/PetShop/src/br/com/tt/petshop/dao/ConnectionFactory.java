package br.com.tt.petshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//padrão factory - para criar coisas.
//padrão singleton - deve haver uma instância/classe em memória, com 1 objeto só criado quando usada.
public class ConnectionFactory {
	
	private static Connection conexao; 
	
	private ConnectionFactory() {
	}
	//padrão singleton - coloca private no construtor, assim fecha de criar objetos, coloca como static
	//o método get que habilita o método pra todos, e o atributo static que deixa ele único no projeto.
	public static Connection getConnection() throws SQLException{
		if(conexao != null && conexao.isClosed()){
			conexao = null;
		}
		if(conexao == null){
			conexao = connectaSqlite();
			conexao.setAutoCommit(true);
			System.out.println("Conexão aberta");
			
			return conexao;
		}
		return conexao;
	}
	
    public static void closeConnection(){
        try{
        	//conexao.commit();
            if(!conexao.isClosed()){
            	conexao.close();
		System.out.println("Conexão fechada");
            }            
        }catch(SQLException ex){
            //Erro ao executar sql.
            try{
            	conexao.rollback();
            }catch(SQLException e){
               // Erro no rollback
            	e.printStackTrace();
            }
        }
    }

	private static Connection connectaSqlite() throws SQLException{
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			throw new SQLException ("Não foi possível carregar o DRIVER.", e);		
		}
		return DriverManager.getConnection("jdbc:sqlite:banco.db");
	}
	
/*	private static Connection connectaMysql() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");                
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "user", "password");
		connection.setAutoCommit(false);
		return connection;
	}
*/
}
