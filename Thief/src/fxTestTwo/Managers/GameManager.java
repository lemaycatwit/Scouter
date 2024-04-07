package fxTestTwo.Managers;

import java.util.ArrayList;

import fxTestTwo.Player.Bonnet;
import fxTestTwo.Tiles.Tile;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class GameManager extends Application{

	public GameState current = GameState.Load;
	static int width = 20;
	static int height = 10;
	public static ArrayList<Tile> map;
	public GameManager inst;
	public Bonnet ply;
	
	public void init(String[] args) {
		loadMap(width,height);
		ply=createPlayer();
		Tile tile =getTile(5,5);
		ply.EnterTile(tile);
		launch(args);
		
		
		
		//inst = this;
	}
	public void loadMap(int x,int y) {
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		for(int i = 0; i<x; i++) {
			for(int o = 0; o<y; o++) {
				tiles.add(new Tile(i,o)); // creates tiles from 0-19,0-9
			}
		}
		map=tiles;
	}
	public Bonnet createPlayer() {
		Bonnet player = new Bonnet(this);
		return player;
	}
	public Tile getTile(int x, int y) {
		for(Tile ti : map) {
			if(ti.getX()==x&&ti.getY()==y) {
				return ti;
			}
		}
		return null;
	}
	@Override
	public void start(Stage pmStage) throws Exception {
		pmStage.setTitle("Rogue-Like");
		StackPane root = new StackPane();
		
		
		pmStage.setResizable(false);
		Rectangle rect = new Rectangle(1000,500);
		rect.setFill(Color.BLACK);
		root.getChildren().add(rect);
		
		// creates the thing and fills it black.
//		Text t = new Text(".");
//		t.setFill(Color.ANTIQUEWHITE);
//		root.getChildren().add(t);
		root = createTiles(root);
		Scene scene = new Scene(root, 500, 250);
		pmStage.setScene(scene);
		pmStage.show();
		
	}
	public StackPane createTiles(StackPane rt) {
		if(map==null) {loadMap(width,height);}
		for(Tile ti : map) {
			int x = 262-(ti.getX()+1)*25;//500 - (ti.getX()+1)*50;
			int y = 137-(ti.getY()+1)*25;//250 - (ti.getY()+1)*50;
			String gly = ti.glyph();
			Text t = new Text(gly);
			
			Translate td = new Translate();
			td.setY(y);
			td.setX(x);
			t.getTransforms().add(td);
			
			t.setFill(Color.ANTIQUEWHITE);
			rt.getChildren().add(t);
			
			
		}
		return rt;
		
	}

}
enum GameState{
	Load,
	Play
}