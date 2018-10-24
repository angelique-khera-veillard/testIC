package fr.esipe.ic.JeuPlusMoins;

import java.util.Random;

public class NbAleatoireService implements INbAleatoireService {
	int max;
	int min;
	public NbAleatoireService(int min, int max){
		this.max = max;
		this.min = min;
	}
	public int getNbAlea() {
		Random rand = new Random();
		int finalX = rand.nextInt(max);
		return finalX;		}

}
