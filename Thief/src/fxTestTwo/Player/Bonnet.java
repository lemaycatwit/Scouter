package fxTestTwo.Player;

import fxTestTwo.Managers.GameManager;
import fxTestTwo.Tiles.Tile;

public class Bonnet {
	private GameManager gm;

	private PlayerStates state;
	public Tile ti;
	
	public void Run() {
		state.Run(this);
	}
	public void EnterTile(Tile tii) {
		ti=tii;
		ti.bon = this;
		//ti.
	}
	
	public Bonnet(GameManager Gm){
		this.setGm(Gm);
	}
	public void setGm(GameManager Gm) {
		gm=Gm;
	}
	public GameManager getGm() {
		return gm;
	}
}
