package fxTestTwo.Player;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;

import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

import fxTestTwo.Managers.GameManager;
import fxTestTwo.Tiles.Tile;
import javafx.scene.input.KeyEvent;

public class Bonnet extends JFrame {
	private GameManager gm;

	
	private Tile ti;
	
	private int hp,str,lvl,armr;
	
	
	
	
	public void Run() {
		
		
	}
	public Boolean real(Tile tile) {
		if(tile==ti) {
			return true;
		}
		return false;
	}
	public void setTile(Tile tt) {
		ti=tt;
	}
	public Tile getTile() {
		return ti;
	}
	public void EnterTile(Tile tii) {
		this.ti=tii;
		this.ti.bon = this;
		//ti.
	}
	public void ExitTile() {
		ti.exited();
	}
	public void MoveTile(Tile tileEn) {
		ExitTile();
		this.EnterTile(tileEn);
	}
	public void Move(String dir) {
		gm.movePlayer(dir, this);
	}
	
	public Bonnet(GameManager Gm){
		this.setGm(Gm);
		setStr(15);
		lvl=1;
		setHp(lvl*3);
		setArmr(1);
	}
	public void setGm(GameManager Gm) {
		gm=Gm;
	}
	public GameManager getGm() {
		return gm;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public int getArmr() {
		return armr;
	}
	public void setArmr(int armr) {
		this.armr = armr;
	}
	
	
	 
}
	

