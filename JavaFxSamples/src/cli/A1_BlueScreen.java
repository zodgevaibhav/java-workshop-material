package cli;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class A1_BlueScreen extends Application {
	
	/*
	  	1. Create launch configuration and add below VM arguments
	  			--module-path /Users/vzodge/Documents/Selenium/javafx-sdk-19/lib --add-modules=javafx.controls
	  	   Run > Run Configuration > Arguments
	  	2. Make sure "StartOnFirstArgument is unchecked from Arguments tab, this was required on AWT, but not for JFX 

	 */

	public static void main(String[] args) {
		System.out.println("***** Before lanuch method");
		Application.launch(args);
		System.out.println("***** After lanuch method");
	}

	@Override // call back function
	public void start(Stage stageProvidedByJavaFx) {
		//Stage stage = new Stage();
		Group actorGroup = new Group(); // Create actorGroup which will perform on the stage
		
		stageProvidedByJavaFx.setTitle("First Window");  // Arrange the stage
		stageProvidedByJavaFx.setFullScreen(true);
		stageProvidedByJavaFx.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		Scene scene = new Scene(actorGroup, Color.BLUE); // Create Scene using actor and backgrounds

		stageProvidedByJavaFx.setScene(scene);  // Put scene on stage before we show stage to audience
		stageProvidedByJavaFx.show(); // Show the stage to audience
	
	}

}
