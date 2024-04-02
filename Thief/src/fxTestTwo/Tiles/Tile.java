package fxTestTwo.Tiles;

public class Tile {
	
	private int y,x;
	public String glyph = ".";
public Tile(int x, int y) {
	this.setX(x);
	this.setY(y);
}
public Tile() {
	this(0,0);
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
