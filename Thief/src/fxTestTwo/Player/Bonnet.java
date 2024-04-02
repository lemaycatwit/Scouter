package fxTestTwo.Player;

import fxTestTwo.Managers.GameManager;

public class Bonnet {
	private GameManager gm;

//	boolean Valid() {
//		if(GameManager)
//	}
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
