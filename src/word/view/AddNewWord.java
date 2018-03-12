package word.view;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import word.JWord;
import word.Main;

import com.mysql.jdbc.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class AddNewWord  {
	@FXML TextField tf3;
	@FXML TextField tf4;
	@FXML Label l1;
	int numberOFwords=0;
	Main m;
	public Paint randomColor() {
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return Color.rgb(r, g, b);
    }
	@FXML private void AddWord(ActionEvent event) throws SQLException{
		JWord w = new JWord();
		 Statement statement = (Statement) w.getConnection().createStatement();
		 ResultSet resultset=statement.executeQuery("select * from word.word");
		 while(resultset.next()){
				numberOFwords=resultset.getInt(1);
			}
		 try {
		 statement.execute("INSERT INTO word.word(id,engl,ukr)VAlUE("+(numberOFwords+1)+ ",'"+tf3.getText()+"','"+tf4.getText()+"')");
		 l1.setText("SUCCESS");
		 l1.setTextFill(randomColor());
		 }catch(SQLException e){
			 l1.setText("MISTAKE");
			 l1.setTextFill(randomColor());
				// TODO Auto-generated catch block
				e.printStackTrace();
		 }
		 
		 }
	@FXML private void home(ActionEvent event) throws IOException  {
		m.showHome();
	}
}
