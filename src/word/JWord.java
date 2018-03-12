package word;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

public class JWord {
	private  final String URL = "jdbc:mysql://127.0.0.1:3306/word?useSSL=true";
	private  final String USERNAME ="root";
	private  final String PASSWORD = "root";
	private Connection connection;
	
	public JWord(){
	try{
		Driver driver = new FabricMySQLDriver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		/*if(!connection.isClosed()){
			System.out.println("connection");
			}
		//connection.close();
		
		if(connection.isClosed()){
			System.out.println("connection is closed");
			}*/}catch(SQLException e)  {
				System.out.println(e);		
				System.out.println("Ups we have some problems");

			}}
		public Connection getConnection(){
			return connection;
			
		}	
}
