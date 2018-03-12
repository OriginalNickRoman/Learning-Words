package word;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import com.mysql.jdbc.Statement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	
	private Stage primaryStage;
	public static BorderPane mainLayout;
	@Override
	public void start(Stage primaryStage) throws IOException {
						
		this.primaryStage=primaryStage;
		this.primaryStage.setTitle("Lerning word App");
		showMainView();
		showMainItems();

	}
	private void showMainView() throws IOException{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		mainLayout=loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	private void showMainItems() throws IOException{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
		AnchorPane mainItems=loader.load();
		mainLayout.setCenter(mainItems);
		
	}
	public static void showStartScene() throws IOException{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("start/start.fxml"));
		AnchorPane start=loader.load();
		mainLayout.setCenter(start);

	}

	public static void showChange() throws IOException{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/ChangeWord.fxml"));
		AnchorPane  ch=loader.load();
		mainLayout.setCenter(ch);

	}
	public static void showAdd() throws IOException{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/Addw.fxml"));
		AnchorPane  a=loader.load();
		mainLayout.setCenter(a);

	}
	public static void showMy() throws IOException{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MyWords.fxml"));
		AnchorPane my=loader.load();
		mainLayout.setCenter(my);
	}
	
	public static void showHome() throws IOException{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
		AnchorPane mainI=loader.load();
		mainLayout.setCenter(mainI);

	}
	public static void showFastU() throws IOException{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("start/FastUkr.fxml"));
		AnchorPane mainI=loader.load();
		mainLayout.setCenter(mainI);

	}
	
	public static void showFastE() throws IOException{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("start/FastEng.fxml"));
		AnchorPane mainI=loader.load();
		mainLayout.setCenter(mainI);

	}
	public static void showLearnE() throws IOException{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("start/LearnEng.fxml"));
		AnchorPane mainI=loader.load();
		mainLayout.setCenter(mainI);

	}
	public static void showLearnUkr() throws IOException{
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("start/LearnUkr.fxml"));
		AnchorPane mainI=loader.load();
		mainLayout.setCenter(mainI);

	}
	public static void showRezalt() throws IOException{
		
			FXMLLoader loader= new FXMLLoader();
			loader.setLocation(Main.class.getResource("start/Result.fxml"));
			AnchorPane resultpane=loader.load();
			Stage result = new Stage();
			result.setTitle("Result");
			result.initModality(Modality.WINDOW_MODAL);
			Scene scene = new Scene(resultpane);
			result.setScene(scene);
			result.showAndWait();
			
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
