package tests;


import vehicles.ILiftOffH;
import vehicles.LiftOff;

public class LiftOffFactory {
	
	public LiftOff createLiftOff(String string) {
		if (string.equals("Like a Fighter Jet")) {
			return new ILiftOffH();
		}
		return null;
	}

}
