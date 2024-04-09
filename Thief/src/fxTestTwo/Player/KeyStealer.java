package fxTestTwo.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyStealer implements KeyListener{

	
		public Bonnet owner;

		KeyStealer(Bonnet bon){
			super();
			owner =bon;
		}
	    /** Handle the key typed event from the text field. */
	    public void keyTyped(KeyEvent e) {
	        displayInfo(e, "KEY TYPED: ");
	    }

	    /** Handle the key-pressed event from the text field. */
	    public void keyPressed(KeyEvent e) {
	        displayInfo(e, "KEY PRESSED: ");
	    }

	    /** Handle the key-released event from the text field. */
	    public void keyReleased(KeyEvent e) {
	        displayInfo(e, "KEY RELEASED: ");
	    }
	    
	    private void displayInfo(KeyEvent e, String keyStatus){
	        
	        if(!keyStatus.equals("KEY PRESSED: ")) {return;}
	        int id = e.getID();
	        if(id==37) {
	        	
	        }else if(id==38) {
	        	
	        }else if(id==39) {
	        	
	        }else if(id==40) {
	        	
	        }
	        System.out.println("funni");
	        // not printing due to something having to do with bonnet I think.
	        ///37 -- Left
	        //38 -- Up
	        //39 -- Right
	        //40 -- Down
	        
	    }

	
}
