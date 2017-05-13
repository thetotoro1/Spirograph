package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TitleMenu.fxml"));
			Parent root = fxmlLoader.load();
			primaryStage.setTitle("Ben's Game");

			primaryStage.setScene(new Scene(root));
			TitleMenuController controller = fxmlLoader.getController();
			primaryStage.show();

			controller.canvasStart();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
