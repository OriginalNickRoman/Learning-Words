package word.start;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import word.JWord;
import word.Main;

import com.mysql.jdbc.Statement;

public class Learn {
	@FXML Label response1;
	@FXML Label response2;
	@FXML Label response3;
	@FXML Label response4;
	@FXML TextField tf1;
	@FXML TextField tf2;
	TextField tf3;
	Main m;
	int numberOFwords=0;
	int temp;
	int id;
	String ukr;
	String engl;
	Random random = new Random();
	
	public Paint randomColor() {
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return Color.rgb(r, g, b);
    }
	
	@FXML private void  answer1(ActionEvent event) throws SQLException{
		String	ans=tf1.getText();                				
		if(ans.equals(ukr)){                					
			response2.setText("Correct !");
			response2.setTextFill(randomColor());			
		}else{
			response2.setText("Wrong! Correct is : "+ ukr);
			response2.setTextFill(randomColor());
		}   
	}
	@FXML private void next1(ActionEvent event) throws SQLException{
		JWord w = new JWord();
		 Statement statement = (Statement) w.getConnection().createStatement();
		 ResultSet resultset=statement.executeQuery("select * from word.word");
		 while(resultset.next()){
				numberOFwords++;
			}
		 try {
				 resultset=statement.executeQuery("select * from word.word");
				temp=random.nextInt(numberOFwords)+1;
				while(resultset.next()){
					//	System.out.println(id);
						id=resultset.getInt(1);
						if(temp==id){
						ukr = resultset.getString(3);
						engl=resultset.getString(2);
						break;
							}
						}
				response1.setText("Translate this word : "+ engl);
				numberOFwords=0;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	
	@FXML private void  answer2(ActionEvent event) throws SQLException{
		String	ans=tf2.getText();                				
		if(ans.equals(engl)){                					
			response4.setText("Correct !");
			response4.setTextFill(randomColor());
			
			
		}else{
			response4.setText("Wrong! Correct is : "+ engl);
			response4.setTextFill(randomColor());
		
		}   
	}
	@FXML private void next2(ActionEvent event) throws SQLException{
		JWord w = new JWord();
		 Statement statement = (Statement) w.getConnection().createStatement();
		 ResultSet resultset=statement.executeQuery("select * from word.word");
		 while(resultset.next()){
				numberOFwords++;
			}
		 try {
				 resultset=statement.executeQuery("select * from word.word");
				temp=random.nextInt(numberOFwords)+1;
				while(resultset.next()){
					//	System.out.println(id);
						id=resultset.getInt(1);
						if(temp==id){
						ukr = resultset.getString(3);
						engl=resultset.getString(2);
						break;
							}
						}
				response3.setText("Translate this word : "+ ukr);
				numberOFwords=0;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	@FXML private void home(ActionEvent event) throws IOException  {
		m.showHome();
	}
}
