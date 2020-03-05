package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{ 
		
		Parent root = FXMLLoader.load(getClass().getResource("calc.fxml"));
		   
	    Scene scene = new Scene(root, 1200, 850);
		
		
	
	    primaryStage.setTitle("Calculator");
	    primaryStage.setScene(scene);
	    primaryStage.setResizable(true);
	    primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
