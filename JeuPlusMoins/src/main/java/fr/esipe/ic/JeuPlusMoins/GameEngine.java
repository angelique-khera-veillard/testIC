package fr.esipe.ic.JeuPlusMoins;

import java.util.Random;
import java.util.Scanner;

public class GameEngine {
	//	int max;
	//	int min;
	int nbAleat;
	int nbCoups;
	//injection du service INbAleatoireService
	public GameEngine(INbAleatoireService nb){
		this.nbAleat = nb.getNbAlea();
		this.nbCoups = 0;
	}
	//	public int entierAleatoire(){
	//		Random rand = new Random();
	//		int finalX = rand.nextInt(max);
	//		return finalX;		
	//	}
	public void jouer(){
		//		int toFind = new NbAleatoireService.getNbAlea(100);
		System.out.println("Enter an integer between 1 and 100: ");
		Scanner scanner = new Scanner(System.in);
		int guess = scanner.nextInt();
		System.out.println("you chose " + guess);
		int nbCoups = 1;
		while (guess != nbAleat){
			String reponse = plusOuMoins(guess);
			System.out.println(reponse);
			guess = scanner.nextInt();
			nbCoups++;
		}
		System.out.println("found it!!"); 
	}
	public String plusOuMoins(int guess) {
		if (guess < nbAleat){
			return "more";
		} else
			return "less";
	}

	public static void main (String [] args){
		//NbAleatoireServiceStub test = new NbAleatoireServiceStub(100);
		GameEngine g = new GameEngine(new NbAleatoireService(0,100));
		//System.out.println(g.entierAleatoire());
		g.plusOuMoins(50).toString();
		Utilisateur u1 = new Utilisateur();	
		u1.login();
		g.jouer();
	}
}
