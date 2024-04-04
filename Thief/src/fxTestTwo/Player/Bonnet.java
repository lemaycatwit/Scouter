package fxTestTwo.Player;

import fxTestTwo.Managers.GameManager;

public class Bonnet {
	private GameManager gm;

	private PlayerStates state;
	
	public void Run() {
		state.Run(this);
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
