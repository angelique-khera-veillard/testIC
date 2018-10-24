package fr.esipe.ic.JeuPlusMoins;

public class NbAleatoireServiceStub implements INbAleatoireService{
	int nb;
	public NbAleatoireServiceStub(int nb){
		this.nb = nb;
	}
	public int getNbAlea() {
		return this.nb;
	}	
}
