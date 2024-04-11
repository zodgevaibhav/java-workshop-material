package login;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application{

	/*
  	1. Create launch configuration and add below VM arguments
  			--module-path /Users/vzodge/Documents/Selenium/javafx-sdk-19/lib --add-modules=javafx.controls,javafx.fml
  	   Run > Run Configuration > Arguments
  	2. Make sure "StartOnFirstArgument is unchecked from Arguments tab, this was required on AWT, but not for JFX 

 */
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
	@Override
	public void start(Stage stageProvidedByJfx) throws Exception {
		
		StageFactory.stageProvidedByJfx = stageProvidedByJfx;
		
        URL url = new URL("file:///Users/vzodge/Documents/ECLIPSE_WORKSPACES/zeal-institute-workshop/JavaFxWithDBLogin/src/login/Login.fxml");
        Parent actorGroup = FXMLLoader.load(url);
		
		stageProvidedByJfx.setTitle("Student Login");
		
		Scene scene = new Scene(actorGroup, 600,400);
		
		stageProvidedByJfx.setScene(scene);

		stageProvidedByJfx.show();
	}

}
