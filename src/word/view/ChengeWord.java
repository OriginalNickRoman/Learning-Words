package word.view;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import word.JWord;
import word.Main;

import com.mysql.jdbc.Statement;

public class ChengeWord {
	@FXML TextField tf5;
	@FXML TextField tf6;
	@FXML TextField tf7;
	@FXML  Label l2;
	Main m;
	int numberOFwords=0;
	int id;
	String engl;
	String ukr;
	public Paint randomColor() {
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return Color.rgb(r, g, b);
    }
	@FXML private void ChengeWord(ActionEvent event) throws SQLException{
		 JWord w = new JWord();
		 Statement statement = (Statement) w.getConnection().createStatement();
		 ResultSet resultset=statement.executeQuery("select * from word.words");
		 while(resultset.next()){
				numberOFwords=resultset.getInt(1);
			}
		  	String temp = tf5.getText();
        	boolean b=false;
        	try {
				
			 resultset=statement.executeQuery("select * from word.word");
				while(resultset.next()){
					id=resultset.getInt(1);
					engl=resultset.getString(2);
					if(temp.equals(engl)){
						b=true;
						break;
						}								
				}
				if(b==false){
					l2.setTextFill(randomColor());
					l2.setText("you have not this word");}
				engl=tf6.getText();
				ukr=tf7.getText();
				int res = statement.executeUpdate("UPDATE word.word SET engl = '"+engl+"',ukr='"+ukr+"'WHERE id="+id);
				l2.setText("word was changed");
				l2.setTextFill(randomColor());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				l2.setText("exception");
				l2.setTextFill(randomColor());
			}
		 
		 }
	@FXML private void home(ActionEvent event) throws IOException  {
		m.showHome();
	}
}
