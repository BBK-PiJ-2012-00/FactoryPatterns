package tests;

import vehicles.Flying;
import vehicles.IDontFly;
import vehicles.IFlyLikeFJ;

public class FlyingFactory {

	public Flying createFlying(String string) {
		if (string.equals("Fighter Jet")) {
			return new IFlyLikeFJ();
		}
		if (string.equals("Model Airplane")) {
			return new IDontFly();
		}
		return null;		
	}

}
