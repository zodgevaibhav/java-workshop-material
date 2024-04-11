package cli;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class A2_SceneWithActorsOnStage extends Application {

	public static void main(String[] args) {
		launch();
	}
	@Override
	public void start(Stage stageRovidedByJavaFx) {
		stageRovidedByJavaFx.setTitle("Text Learn");

		Group actorGroup = new Group();

		Text actorText = new Text();		
		actorText.setText("Hello World!!");
		actorText.setX(50);
		actorText.setY(50);
		actorText.setFont(Font.font("Verdana",50));
		actorText.setFill(Color.WHITE);
		
		Line actorLine = new Line();
		actorLine.setStrokeWidth(5);
		actorLine.setStartX(60);
		actorLine.setStartY(60);
		actorLine.setEndX(370);
		actorLine.setEndY(60);
		actorLine.setStroke(Color.WHITE);
		
		Rectangle actorRect = new Rectangle();
		actorRect.setX(80);
		actorRect.setY(80);
		actorRect.setWidth(250);
		actorRect.setHeight(250);
		actorRect.setFill(Color.WHITE);
		
		
		
		// Add all actors in group
		actorGroup.getChildren().add(actorText);
		actorGroup.getChildren().add(actorLine);
		actorGroup.getChildren().add(actorRect);
		
		
		Scene scene = new Scene(actorGroup, Color.BLACK); // Create scene using actors

		stageRovidedByJavaFx.setScene(scene);
		stageRovidedByJavaFx.show();
	
	}

}
