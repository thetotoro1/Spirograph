package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TitleMenuController {

	@FXML
	private TextField textField;
	
	
	
	public void buttonClicked(){
		
		System.out.println(textField.getText());
		
	}
	
	
}
