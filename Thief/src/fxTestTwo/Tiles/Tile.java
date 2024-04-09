package fxTestTwo.Tiles;

import fxTestTwo.Player.Bonnet;

public class Tile {
	
	private int y,x;
	public String glyph() {
		try {
		if(bon==null) {
			return ".";
		}
		else if(bon.real(this)){
			return "@";
		}
		}
		catch(NullPointerException ex) {
			return ".";
		}
		return ".";
	}
	public Bonnet bon;	// if it is occupied
	
public Tile(int x, int y) {
	this.setX(x);
	this.setY(y);
}
public Tile() {
	this(0,0);
}
public void exited() {
	this.bon=null;
}
public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

}
