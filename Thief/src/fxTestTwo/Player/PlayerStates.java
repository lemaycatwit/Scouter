package fxTestTwo.Player;

public abstract class PlayerStates {

	public abstract void StateChange(Bonnet bon);
	public abstract void Run(Bonnet bon);
	public abstract void StateLeave(Bonnet bon);
}
