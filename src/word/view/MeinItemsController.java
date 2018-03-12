package word.view;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import word.Main;

public class MeinItemsController {
private Main main;
@FXML TextField tf1;
@FXML  Label l1;
private MyWords m;


@FXML
private void learn1(ActionEvent event) throws IOException{
	main.showLearnE();	
}
@FXML
private void learn2(ActionEvent event) throws IOException{
	main.showLearnUkr();
	}
@FXML
private void Fast1(ActionEvent event) throws IOException{
	main.showFastE();
}
@FXML
private void Fast2(ActionEvent event) throws IOException{
	main.showFastU();
	}


@FXML
private void goClose() {
    System.exit(0);

}
@FXML
private void goCh() throws IOException {
	main.showChange();
}
@FXML
private void goAdd() throws IOException {
	main.showAdd();

}
@FXML
private void goMy() throws IOException, SQLException {

	main.showMy();
}
@FXML
private void goHome() throws IOException {
     main.showHome();
}

}
