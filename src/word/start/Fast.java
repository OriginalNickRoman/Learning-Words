package word.start;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import javax.xml.transform.Result;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import word.JWord;
import word.Main;
import word.Word;



public class Fast implements Initializable{	
		
		Main m;
		@FXML TextField tf1;
		@FXML TextField tf2;
		@FXML TextField tf3;
		@FXML  Label l1;
		@FXML  Label l2;
		// double mistakes = 0.0;
		//double good=0.0;
		@FXML  TableView<Word> table ;
		@FXML  TableColumn<Word, String> inEngl;
		@FXML  TableColumn<Word, String> inUkr ;
		@FXML  TableColumn<Word, String> idi ;
		
		int numberOFwords=1;
		int temp;
		String ukr;
		String engl;
		Random random = new Random();
		
		
		ObservableList<Word> list = FXCollections.observableArrayList(); 
	
		public Paint randomColor() {
	        Random random = new Random();
	        int r = random.nextInt(255);
	        int g = random.nextInt(255);
	        int b = random.nextInt(255);
	        return Color.rgb(r, g, b);
	    }
		
		@FXML private void AddWord(ActionEvent event)  {
			Word word = new Word(numberOFwords,tf1.getText(),tf2.getText());
			list.add(word);
			numberOFwords++;
			 }
		@FXML private void Fast1(ActionEvent event)  {
			temp=random.nextInt(numberOFwords)+1;
			for (Word word : list) {
				if(word.getId()==temp){
					ukr=word.getUkr();
					engl=word.getEngl();
					break;
				}
			}
			l1.setText("Translate this word : "+ engl);			
			 }
		@FXML private void  answer1(ActionEvent event) {
			String	ans=tf3.getText();                				
			if(ans.equals(ukr)){                					
				l2.setText("Correct !");
				l2.setTextFill(randomColor());
				
			}else{
				l2.setText("Wrong! Correct is : "+ ukr);
				l2.setTextFill(randomColor());
		
			}   
		}

		@FXML private void Fast2(ActionEvent event)  {
			temp=random.nextInt(numberOFwords)+1;
			for (Word word : list) {
				if(word.getId()==temp){
					ukr=word.getUkr();
					engl=word.getEngl();
					break;
				}
			}
			l1.setText("Translate this word : "+ukr);			
			 }
		@FXML private void  answer2(ActionEvent event) {
			String	ans=tf3.getText();                				
			if(ans.equals(engl)){                					
				l2.setText("Correct !");
				l2.setTextFill(randomColor());

			//	good++;
				
			}else{
				l2.setText("Wrong! Correct is : "+ engl);
				l2.setTextFill(randomColor());

			//	mistakes++;
						
			}   
		}
		
		@FXML private void home(ActionEvent event) throws IOException  {
			m.showHome();
		}

		
		
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			inEngl.setCellValueFactory(new PropertyValueFactory<Word,String>("engl"));
		    inUkr.setCellValueFactory(new PropertyValueFactory<Word,String>("ukr"));
		    idi.setCellValueFactory(new PropertyValueFactory<Word,String>("id"));	
		    table.setItems((ObservableList<Word>) list);		
		}
		
}
