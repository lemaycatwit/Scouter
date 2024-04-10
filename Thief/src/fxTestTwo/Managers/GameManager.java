package fxTestTwo.Managers;

import java.util.ArrayList;

import fxTestTwo.Player.Bonnet;
import fxTestTwo.Tiles.Tile;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class GameManager extends Application{

	static int width = 50;
	static int height = 20;
	public ArrayList<Tile> map;
	//public GameManager inst;
	public Bonnet ply;
	
	public Stage stg;
	public StackPane rtg;
	public Scene ssg;
	
	public void init(String[] args) {
		
		
		
		launch(args);
		
		
		
		//inst = this;
	}
	void loadMap(int x,int y) {
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		for(int i = 0; i<x; i++) {
			for(int o = 0; o<y; o++) {
				tiles.add(new Tile(i,o)); // creates tiles from 0-19,0-9
			}
		}
		this.map=tiles;
	}
	public Bonnet createPlayer() {
		Bonnet ply = new Bonnet(this);
		return ply;
	}
	public void setPlayer(Bonnet bo) {
		this.ply=bo;
	}
	public Bonnet getPlayer() {
		if(this.ply==null) {return createPlayer();}
		return this.ply;
	}
	public Tile getTile(int x, int y) {
		if(map==null) {loadMap(width,height);
		//System.out.println("new map");
		}
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
		
		Tile tile =getTile(5,5);
		Bonnet bo = getPlayer();
		bo.EnterTile(tile);
		setPlayer(bo);
		
		
		pmStage.setResizable(false);
		Rectangle rect = new Rectangle(1000,500);
		rect.setFill(Color.BLACK);
		root.getChildren().add(rect);
		
		// creates the thing and fills it black.
//		Text t = new Text(".");
//		t.setFill(Color.ANTIQUEWHITE);
//		root.getChildren().add(t);
		root = createTiles(root);
		root = createBottom(root,bo);
		Scene scene = new Scene(root, 500, 250);
		pmStage.setScene(scene);
		pmStage.show();
		
		stg=pmStage;
		ssg=scene;
		rtg=root;
		
		scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
		      if(key.getCode()==KeyCode.UP) {
		          bo.Move("UP");
		      }
		      else if(key.getCode()==KeyCode.LEFT) {
		    	  bo.Move("LEFT");
		      }
		      else if(key.getCode()==KeyCode.RIGHT) {
		    	  bo.Move("RIGHT");
		      }
		      else if(key.getCode()==KeyCode.DOWN) {
		    	  bo.Move("DOWN");
		      }
		});
		
	}
	public void movePlayer(String req, Bonnet bo) {
		 // it does!
		Tile ti = bo.getTile();
		int x = ti.getX();
		int y = ti.getY();
		if(req.equals("UP")) {
			y++;
		}else if(req.equals("DOWN")) {
			y--;
		}else if(req.equals("LEFT")) {
			x++;
		}else if(req.equals("RIGHT")) {
			x--;
		}
		
		Tile tii = getTile(x,y);
		if(tii==null) {return;}
		
		bo.MoveTile(tii);
		// if you go to 0,0, print out goku
		
		//System.out.println("work?"+x+" "+y);
		repaint(stg,rtg);
	}
	public void repaint(Stage st, StackPane rt) {
		rt.getChildren().clear();
		rt=repaint(rt);
		//st.setScene(ssg);
		//st.show();
		stg=st;
		rtg=rt;
	}
	public StackPane repaint(StackPane rt) {
		Rectangle rect = new Rectangle(1000,500);
		rect.setFill(Color.BLACK);
		rt.getChildren().add(rect);
		
		rt=createTiles(rt);
		rt=createBottom(rt,this.ply);
		return rt;
	}
	public StackPane createTiles(StackPane rt) {
		if(map==null) {loadMap(width,height);}
		
		for(Tile ti : map) {
			int x = 255-(ti.getX()+1)*10;//500 - (ti.getX()+1)*50;
			int y = 75-(ti.getY()+1)*10;//250 - (ti.getY()+1)*50;
			String gly = ti.glyph();
			Text t = new Text(gly);
			
			
			Translate td = new Translate();
			td.setY(y);
			td.setX(x);
			t.getTransforms().add(td);
			
			t.setFill(Color.ANTIQUEWHITE);
			
			if(rt.getChildren().contains(t)==false) {
				rt.getChildren().add(t);
			}
			
			
		}
		return rt;
		
	}
	public StackPane createBottom(StackPane rt, Bonnet bon) {
		
		
		String str = String.format("HP: %d   ARMR: %d   STR: %d   LVL: %d   ", bon.getHp(),bon.getArmr(),bon.getStr(),bon.getLvl());
		
		//System.out.println(str);
		Text t = new Text(str);
		
		Translate td = new Translate();
		td.setY(100);
		td.setX(10);
		t.getTransforms().add(td);
		
		t.setFill(Color.ANTIQUEWHITE);
		rt.getChildren().add(t);
		return rt;
	}
	

}
