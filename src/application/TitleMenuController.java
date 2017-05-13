package application;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

public class TitleMenuController {

	@FXML
	private TextField textField;
	
	@FXML
	private Circle turtle;
	
	@FXML
	private Canvas canvas;
	
	public void buttonClicked(){
		
		System.out.println(textField.getText());
		
		drawSpiro(textField.getText());
	
		
	}

	public void canvasStart(){
		
		GraphicsContext g = canvas.getGraphicsContext2D();

		
	}


	private void drawSpiro(String text) {
		
		
		
		
	}


	
	
}
