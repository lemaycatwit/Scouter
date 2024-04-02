package fxTestTwo;

import fxTestTwo.Managers.GameManager;
import fxTestTwo.Player.Bonnet;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UnOwen extends Application {

	public static void main(String[] args) {
		GameManager gm = new GameManager();
		Bonnet bon = gm.createPlayer();
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Rogue-Like");
		final StackPane root = new StackPane();
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}

}
