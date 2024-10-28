package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		// TODO Auto-generated constructor stub
	}
	
	public void donner(Commercant beneficiaire) {
		return beneficiaire.getArgent()*(1-(10/100));
	}
}
