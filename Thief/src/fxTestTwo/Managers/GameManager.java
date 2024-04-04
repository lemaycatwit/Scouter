package fxTestTwo.Managers;

import java.util.ArrayList;

import fxTestTwo.Player.Bonnet;
import fxTestTwo.Tiles.Tile;

public class GameManager {

	public GameState current = GameState.Load;
	static int width = 20;
	static int height = 10;
	static ArrayList<Tile> map;
	public GameManager inst;
	
	public static void init() {
		loadMap(width,height);
		fxMap();
		//createPlayer();
		//inst = this;
	}
	public static void loadMap(int x,int y) {
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		for(int i = 0; i<x; i++) {
			for(int o = 0; o<y; o++) {
				tiles.add(new Tile(i,o)); // creates tiles from 0-19,0-9
			}
		}
		map=tiles;
	}
	public static void fxMap() {
		
	}
	public Bonnet createPlayer() {
		Bonnet player = new Bonnet(this);
		return player;
	}

}
enum GameState{
	Load,
	Play
}