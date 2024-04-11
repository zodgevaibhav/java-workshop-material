package login;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomePage {
	
	public static void show() throws IOException {
		
        URL url = new URL("file:///Users/vzodge/Documents/ECLIPSE_WORKSPACES/zeal-institute-workshop/JavaFxWithDBLogin/src/login/Home.fxml");
        Parent actorGroup = FXMLLoader.load(url);
		
		StageFactory.stageProvidedByJfx.setTitle("Home");
		
		Scene scene = new Scene(actorGroup, 600,400);
		
		StageFactory.stageProvidedByJfx.setScene(scene);

		StageFactory.stageProvidedByJfx.show();
	}

}
