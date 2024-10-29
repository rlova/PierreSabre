package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	
	public int getHonneur() {
		return honneur;
	}

	public void donner(Commercant beneficiaire) {
		int argentDonner = (int) (this.getArgent()*0.1);
		this.setArgent(this.getArgent()-argentDonner); 
		beneficiaire.recevoir(argentDonner);
	}
}
