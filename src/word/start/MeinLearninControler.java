package word.start;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import com.mysql.jdbc.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import word.JWord;
import word.Main;

public class MeinLearninControler  {
	/*@FXML Label response1;
	@FXML Label response2;
	@FXML Label response3;

	Label response4;
	@FXML TextField tf1;
	TextField tf2;
	TextField tf3;


	private Main main;
	int numberOFwords=0;
	int tempo;
	int id;
	String ukr;
	String engl;
	Random random = new Random();
	@FXML
	private void goHome() throws IOException {
	     main.showHome();
	}
	@FXML
	private void  prob(ActionEvent event) throws SQLException{
		JWord w = new JWord();
		 Statement statement = (Statement) w.getConnection().createStatement();
		 ResultSet resultset=statement.executeQuery("select * from word2.words2");
		 while(resultset.next()){
				numberOFwords++;
			}
		 try {
				 resultset=statement.executeQuery("select * from word2.words2");
				tempo=random.nextInt(numberOFwords)+1;
				while(resultset.next()){
					//	System.out.println(id);
						id=resultset.getInt(1);
						if(tempo==id){
						ukr = resultset.getString(3);
						engl=resultset.getString(2);
						break;
							}
						}
				response1.setText("Translate this word : "+ engl);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
	@FXML private void  answer(ActionEvent event) throws SQLException{
		String	ans=tf1.getText();                				
		if(ans.equals(ukr)){                					
			response2.setText("Correct !");
			
		}else{
			response2.setText("Wrong! Correct is : "+ ukr);
					
		}   
	}
	@FXML private void next(ActionEvent event) throws SQLException{
		JWord w = new JWord();
		 Statement statement = (Statement) w.getConnection().createStatement();
		 ResultSet resultset=statement.executeQuery("select * from word2.words2");
		 while(resultset.next()){
				numberOFwords++;
			}
		 try {
				 resultset=statement.executeQuery("select * from word2.words2");
				tempo=random.nextInt(numberOFwords)+1;
				while(resultset.next()){
					//	System.out.println(id);
						id=resultset.getInt(1);
						if(tempo==id){
						ukr = resultset.getString(3);
						engl=resultset.getString(2);
						break;
							}
						}
				response1.setText("Translate this word : "+ engl);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}*/
	
	
}