package fxTestTwo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class testFX extends Application {

	//public static void main(String[] args) {launch(args);}
	@Override
	public void start(Stage primaryStage) {
	primaryStage.setTitle("Rogue-Like");
	//final Button btn = new Button("Click Me!");
	final StackPane root = new StackPane();
	//root.getChildren().add(btn);
	primaryStage.setScene(new Scene(root, 300, 250));
	primaryStage.show();
	}
	
	
	testFX(String[] ar){
		launch(ar);
	}

}
