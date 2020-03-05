package applicationWindows;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{ 
		
		Parent root = FXMLLoader.load(getClass().getResource("/FXMLDocs/calc.fxml"));
		   
	    Scene scene = new Scene(root, 1050, 750);
		
	   
	
	    primaryStage.setTitle("Calculator");
	    primaryStage.setScene(scene);
	    primaryStage.setResizable(true);
	    primaryStage.show();
	    
	    
	    primaryStage.setOnCloseRequest(e -> {
	    	applicationMessages.closeRequestMessage.display("Confirm Exit", "Are you sure you want to exit? All "
	    			+ "windows will be closed.");
	    	if(applicationMessages.closeRequestMessage.closePressed) {
	    		System.exit(0); //closes all Platform.exit() doesn't work for some reason.
	    	}
	    	else {
	    		e.consume();
	    	}
	    	
	    	
	    });
	    
	   
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
