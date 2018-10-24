package fr.esipe.ic.JeuPlusMoins;

import java.util.Scanner;

public class Utilisateur {
	private String pseudo;
	private String mdp;
	//private int ScoreMax;
	public Utilisateur(String pseudo, String mdp){
		this.pseudo = pseudo;
		this.mdp = mdp;
	}
	public Utilisateur(){
		this("monPseudo", "monMdp");
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public void login(){
		System.out.println("Enter your login : ");
		Scanner scanner = new Scanner(System.in);
		String pseudo = scanner.nextLine();
		//System.out.println("Enter your password : ");
		//String mdp = scanner.nextLine();
		this.setPseudo(pseudo);
	}
	
//	public static void main (String [] args){
//		Utilisateur u1 = new Utilisateur();
//		
//	}
}
