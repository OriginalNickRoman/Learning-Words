package word.view;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mysql.jdbc.Statement;

import word.JWord;
import word.Main;
import word.Word;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MyWords implements Initializable{
	
	int id;
	String engl;
	String ukr;
	@FXML  TableView<Word> table ;
	@FXML  TableColumn<Word, String> inEngl;
	@FXML  TableColumn<Word, String> inUkr ;
	@FXML  TableColumn<Word, String> idi ;
	ObservableList<Word> list = FXCollections.observableArrayList();
	Main m;
	
	@FXML
  private  void Mywords(ActionEvent event) throws SQLException{
		JWord w = new JWord();
		 Statement statement = (Statement) w.getConnection().createStatement();	 
        try {
     	 ResultSet resultset=statement.executeQuery("select * from word.word");
     	
			while (resultset.next()) {
				id=resultset.getInt(1);
				engl=resultset.getString(2);
				ukr=resultset.getString(3);
				Word myWord=new Word(id,engl,ukr);
				list.add(myWord);
						}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
    table.setItems(list);
}
}
